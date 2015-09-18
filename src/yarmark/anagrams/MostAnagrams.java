package yarmark.anagrams;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class MostAnagrams {
	public static void main(String[] args) {
		
		File file = new File("US.dic");
		HashSet <String> words = new HashSet <String>();
		
		try {
			Scanner readFile = new Scanner(file);
			
			while (readFile.hasNext()) {
				words.add(readFile.next());
			}
			readFile.close();
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
