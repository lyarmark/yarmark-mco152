package yarmark.quadraticEquation;

public class QuadraticEquation {

	private double a;
	private double b;
	private double c;

	public QuadraticEquation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	// the return types for the methods below are set to Double,
	// because a quadratic equation may not have roots
	// if a == 0, the equation is not quadratic. it is a straight line.
	// if b == 0, the answers to getPos() and getNeg() will be opposite
	// inverses.

	public double getPositiveX() throws NoAnswerException, InvalidDataException {
		if (a == 0) {
			throw new InvalidDataException();
		}
		if (((b * b) - 4 * a * c) < 0) {
			throw new NoAnswerException();
		}
		return (-this.b + (Math.sqrt((b * b) - 4 * a * c))) / (2 * a);
	}

	public Double getNegativeX() throws NoAnswerException, InvalidDataException {
		if (a == 0) {
			throw new InvalidDataException();
		}
		if (((b * b) - 4 * a * c) < 0) {
			throw new NoAnswerException();
		}
		return (-this.b - (Math.sqrt((b * b) - 4 * a * c))) / (2 * a);
	}
}
