package yarmark.pythagoreanTheorem;

import org.junit.Assert;
import org.junit.Test;

public class PythagoreanTheoremTest {
	
	PythagoreanTheorem pt = new PythagoreanTheorem();
	
	@Test
	public void testSetAB() {
		pt.setAB(3, 4);
		Assert.assertEquals(5, pt.getC());
	}
	@Test
	public void testSetAC() {
		pt.setAC(3, 5);
		Assert.assertEquals(4, pt.getB());
	}
	@Test
	public void testSetBC() {
		pt.setBC(4, 5);
		Assert.assertEquals(3, pt.getA());
	}
}
