package yarmark.scrabble;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class ScrabbleDictionary {

	// private ArrayList<String> dictionary;
	private HashSet dictionary = new HashSet<String>();

	public ScrabbleDictionary() {
		File file = new File("US.dic");
		try {

			Scanner readFile = new Scanner(file);

			// dictionary = new ArrayList<String>();
			// { dictionary.add(readFile.next());

			while (readFile.hasNext()) {
				dictionary.add(readFile.next());
			}
			readFile.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean contains(String word) {
		return (this.dictionary.contains(word.toLowerCase()));
	}
}