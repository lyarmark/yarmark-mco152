package yarmark.morseCode;

@SuppressWarnings("serial")
public class NotFoundException extends Exception {
	public NotFoundException() {
		super("Data not found");
	}
}
