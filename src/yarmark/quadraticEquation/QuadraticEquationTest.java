package yarmark.quadraticEquation;

import org.junit.Assert;
import org.junit.Test;

public class QuadraticEquationTest {

	public void testGetNegativeX() throws NoAnswerException, InvalidDataException {
		QuadraticEquation qe = new QuadraticEquation(2, -3, -2);
		double x = qe.getNegativeX();
		Assert.assertEquals(-.5, x, 0.1);
	}

	public void testGetNegativeXThrowsException() throws InvalidDataException {
		QuadraticEquation qe = new QuadraticEquation(2, 0, 2);
		try {
			qe.getNegativeX();
			Assert.fail("did not throw exception");
		} catch (NoAnswerException e) {
			//expected
		}
	}

	public void testGetNegativeYThrowsException() throws InvalidDataException {
		QuadraticEquation qe = new QuadraticEquation(2, 0, 2);
		try {
			qe.getPositiveX();
			Assert.fail("did not throw exception");
		} catch (NoAnswerException e) {
			//expected
		}
	}

	@Test
	public void testGetPositveX() throws NoAnswerException, InvalidDataException {
		QuadraticEquation qe = new QuadraticEquation(2, -3, -2);
		double x = qe.getPositiveX();
		Assert.assertEquals(2, x, 0.1);
	}

	public void testThrowsNoAnswerException() {
		try {
			QuadraticEquation qe = new QuadraticEquation(0, 0, 0);
			Assert.fail("did not throw exception");
		} catch (InvalidDataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
