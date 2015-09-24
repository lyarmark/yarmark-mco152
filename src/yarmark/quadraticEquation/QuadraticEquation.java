package yarmark.quadraticEquation;

public class QuadraticEquation {

	private double a;
	private double b;
	private double c;

	public QuadraticEquation(double a, double b, double c) throws InvalidDataException {
		if (a == 0) {
			throw new InvalidDataException();
		}
		this.a = a;
		this.b = b;
		this.c = c;
	}

	// the return types for the methods below are set to Double,
	// because a quadratic equation may not have roots
	// if a == 0, the equation is not quadratic. it is a straight line.
	// if b == 0, the answers to getPos() and getNeg() will be opposite
	// inverses.

	public Double getNegativeX() throws NoAnswerException {
		if (this.b * this.b - 4 * this.a * this.c < 0) {
			throw new NoAnswerException();
		}
		return (-this.b - Math.sqrt(this.b * this.b - 4 * this.a * this.c)) / (2 * this.a);
	}

	public double getPositiveX() throws NoAnswerException {
		if (this.b * this.b - 4 * this.a * this.c < 0) {
			throw new NoAnswerException();
		}
		return (-this.b + Math.sqrt(this.b * this.b - 4 * this.a * this.c)) / (2 * this.a);
	}
}
