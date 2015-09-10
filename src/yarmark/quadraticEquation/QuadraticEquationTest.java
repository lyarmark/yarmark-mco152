package yarmark.quadraticEquation;

import org.junit.Assert;
import org.junit.Test;

public class QuadraticEquationTest {

	@Test
	public void testGetPositveX() throws NoAnswerException, InvalidDataException {
		QuadraticEquation qe = new QuadraticEquation(2, -3, -2);
		double x = qe.getPositiveX();
		Assert.assertEquals(2, x, 0.1);
	}

	public void testGetNegativeX() throws NoAnswerException, InvalidDataException {
		QuadraticEquation qe = new QuadraticEquation(2, -3, -2);
		double x = qe.getNegativeX();
		Assert.assertEquals(-.5, x, 0.1);
	}
}
