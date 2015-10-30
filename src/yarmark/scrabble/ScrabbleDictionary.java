package yarmark.scrabble;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class ScrabbleDictionary {

	// private ArrayList<String> dictionary;
	private HashSet<String> dictionary = new HashSet<String>();

	// have the whole program use this one instance
	// public final static ScrabbleDictionary singleton = new
	// ScrabbleDictionary();
	// depending of how you wrote ur program, this may throw an IOException
	// so make it private and make a getter

	private static ScrabbleDictionary singleton;

	public static ScrabbleDictionary getInstance() {
		if (singleton == null) {
			singleton = new ScrabbleDictionary();
		}
		return singleton;
	}

	// making the constructor private only allows the instantiation of one
	// instance,
	// with the getInstance() method
	private ScrabbleDictionary() {
		try {

			// Scanner readFile = new Scanner(file);
			BufferedReader read = new BufferedReader(new FileReader("US.dic"));

			// dictionary = new ArrayList<String>();
			// { dictionary.add(readFile.next());
			String s;

			while ((s = read.readLine()) != null) {
				dictionary.add(s);
			}
			read.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean contains(String word) {
		return (this.dictionary.contains(word.toLowerCase()));
	}
}