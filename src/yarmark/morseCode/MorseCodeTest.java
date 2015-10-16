package yarmark.morseCode;

import org.junit.Assert;
import org.junit.Test;

public class MorseCodeTest {

	MorseCode mc = new MorseCode();

	@Test
	public void testDecode() {
		String decoded = this.mc.decode("-.-. .-   -... -..");
		Assert.assertEquals("CA BD", decoded);
	}

	public void testEncode() throws NotFoundException {
		String encoded = this.mc.encode("AB CD");
		Assert.assertEquals(".- -...   -.-. -..", encoded);
	}

	public void testEncodeThrowsException() {
		try{
		String encoded = this.mc.encode("12 ?");
		Assert.fail("did not fail");
	}
	 catch (NotFoundException e) {
		 //expected
	 }
}
}
