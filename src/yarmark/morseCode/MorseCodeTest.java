package yarmark.morseCode;

import junit.framework.Assert;

import org.junit.Test;

public class MorseCodeTest {

	MorseCode mc = new MorseCode();

	@Test
	public void testToText() {
		String decoded = mc.toText("-.-. .-   -... -..");
		Assert.assertEquals("CA BD ", decoded);
	}

	public void testToMorse() throws NotFoundException {
		String encoded = mc.toMorse("AB CD");
		Assert.assertEquals(".- -...   -.-. -..", encoded);
	}
}
