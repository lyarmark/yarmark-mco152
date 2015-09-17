package yarmark.scrabble;

import org.junit.Test;
import junit.framework.Assert;

public class ScrabbleDictionaryTest {

	@Test
	public void testScrabbleDictionary() {
		ScrabbleDictionary sd = new ScrabbleDictionary();
		boolean test = sd.contains("Peach");
		Assert.assertEquals(true, test);
	}

	@Test
	public void testScrabbleDictionary1() {
		ScrabbleDictionary sd = new ScrabbleDictionary();
		boolean test = sd.contains("plum");
		Assert.assertEquals(true, test);
	}
}
