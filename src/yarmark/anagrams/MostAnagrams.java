package yarmark.anagrams;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MostAnagrams {
	public static void main(String[] args) {

		File file = new File("US.dic");

		try {
			Scanner readFile = new Scanner(file);

			// hashmap contains an alphabetized char array as the primary key
			// and an ArrayList <String> to hold all the associated anagrams
			HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
			String most = "";
			while (readFile.hasNext()) {
				String s = readFile.next();

				// sort the chars of the string alphabetically
				/*
				 * this method of alphabetizing a string mutates and returns one
				 * variable rather than constantly creating a new variable the
				 * parameters define the container type and how the elements
				 * will be added to the container
				 */
				String key = s.chars().sorted()
						.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();

				// if this char combination already exists, add the string to
				// the corresponding arraylist

				/*
				 * creating a copy of the arraylist returned by map.get(key)
				 * would not be useful because the second method call adds an
				 * element to the real copy of the arraylist, and the third
				 * method call needs the size of the updated arraylist, not of
				 * the previous copy. Thus, repeating the method is more
				 * efficient than saving the returned arraylist for 1 time use
				 * in the first call
				 */
				if (map.get(key) != null) {
					map.get(key).add(s);
					// keep track of the most anagrams
					if (most.length() < map.get(key).size()) {
						most = key;
					}
				}
				// if this char combination does not exist, make a new string
				// arraylist
				// and put the char key and arraylist into the map
				else {
					ArrayList<String> strings = new ArrayList<String>();
					strings.add(s);
					map.put(key, strings);
				}
			}
			readFile.close();

			System.out.println(map.get(most).size() + " words");
			System.out.println(map.get(most));

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
