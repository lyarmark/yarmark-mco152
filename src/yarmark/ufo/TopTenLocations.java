package yarmark.ufo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
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
			ArrayList<String> keys;

			// put the locations into a hashmap
			// with location as the key and a counter
			for (UFOSightings ufo : list) {
				String location = ufo.getLocation();
				if (map.get(location) != null) {
					map.put(location, map.get(location) + 1);
				} else {
					map.put(location, 1);
				}

				keys = new ArrayList<String>(map.keySet());
				keys.sort(new Comparator<String>() {

					@Override
					public int compare(String a, String b) {
						return map.get(a).compareTo(map.get(b));
					}
				});
			}

			for (int i = 0; i <= 10; i++) {
				System.out.print(keys.get(i) + ": " + map.get(keys.get(i)));
			}

		} catch (FileNotFoundException e) {
			System.out.println("UFO File not found");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
