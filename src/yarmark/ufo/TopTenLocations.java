package yarmark.ufo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

import com.google.gson.Gson;

public class TopTenLocations {
	public static void main(String[] args) {
		BufferedReader in;
		try {
			in = new BufferedReader(new FileReader("./ufo_awesome.json"));

			Gson gson = new Gson();

			UFOSightingList list = gson.fromJson(in, UFOSightingList.class);

			in.close();

			HashMap<String, Integer> map = new HashMap<String, Integer>();
			String[] topTen = new String[10];

			// put the locations into a hashmap
			// with location as the key and a counter
			for (UFOSightings ufo : list) {
				String location = ufo.getLocation();
				if (map.get(location) != null) {
					map.put(location, map.get(location) + 1);
				} else {
					map.put(location, 1);
				}

				// compare the current count to the sorted array
				for (int i = topTen.length - 1; i >= 0; i--) {
					// fill in the array intially
					if (topTen[i] == null) {
						topTen[i] = location;
						break;
					}

					int arrayCount = map.get(topTen[i]);
					int mapCount = map.get(location);

					if (arrayCount > mapCount) {
						continue;
					} else if (arrayCount < mapCount) {
						if (i == 0 || map.get(topTen[i - 1]) > mapCount
								&& !(topTen[i - 1].equalsIgnoreCase(location))) {
							for (int j = topTen.length - 1; j > i; j--) {
								topTen[j] = topTen[j - 1];
							}
							topTen[i] = location;
						}
					}
				}
			}

			for (String s : topTen) {
				System.out.println(s + " " + map.get(s));
			}

		} catch (FileNotFoundException e) {
			System.out.println("UFO File not found");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int sort(HashMap<String, Integer> map, String location,
			String[] topTen, int i) {
		return map.get(topTen[i]).compareTo(map.get(location));
	}
}
