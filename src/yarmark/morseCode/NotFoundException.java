package yarmark.morseCode;

public class NotFoundException extends Exception {
	public NotFoundException() {
		super("Data not found");
	}
}
