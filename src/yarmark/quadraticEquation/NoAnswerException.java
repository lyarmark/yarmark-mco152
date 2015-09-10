package yarmark.quadraticEquation;

public class NoAnswerException extends Exception {
	public NoAnswerException() {
		super("There are not roots found for this example.");
	}
}
