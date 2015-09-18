package yarmark.morseCode;

import junit.framework.Assert;

import org.junit.Test;

public class MorseCodeTest {

	MorseCode mc = new MorseCode();

	@Test
	public void testDecode() {
		String decoded = mc.decode("-.-. .-   -... -..");
		Assert.assertEquals("CA BD", decoded);
	}

	public void testEncode() throws NotFoundException {
		String encoded = mc.encode("AB CD");
		Assert.assertEquals(".- -...   -.-. -..", encoded);
	}
}
