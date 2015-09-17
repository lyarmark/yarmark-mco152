package yarmark.scrabble;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScrabbleDictionary {
	public ScrabbleDictionary() {
	}

	public boolean contains(String word) {
		File dictionary = new File("US.dic");
		Scanner readFile;
		try {
			readFile = new Scanner(dictionary);

			while (readFile.hasNext()) {
				if (readFile.next().equalsIgnoreCase(word)) {
					readFile.close();
					return true;
				}
			}
			readFile.close();
			return false;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}