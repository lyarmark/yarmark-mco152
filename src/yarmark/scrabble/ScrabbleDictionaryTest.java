package yarmark.scrabble;

import org.junit.Assert;
import org.junit.Test;

public class ScrabbleDictionaryTest {

	@Test
	public void testScrabbleDictionary() {
		ScrabbleDictionary sd = ScrabbleDictionary.getInstance();
		boolean test = sd.contains("Peach");
		Assert.assertTrue(test);
	}

	@Test
	public void testScrabbleDictionary1() {
		ScrabbleDictionary sd = ScrabbleDictionary.getInstance();
		boolean test = sd.contains("plum");
		Assert.assertTrue(test);
	}
}
