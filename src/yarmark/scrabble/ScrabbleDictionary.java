package yarmark.scrabble;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ScrabbleDictionary {

	private ArrayList<String> dictionary;

	public ScrabbleDictionary() {
		File file = new File("US.dic");
		try {

			Scanner readFile = new Scanner(file);
			dictionary = new ArrayList<String>();
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