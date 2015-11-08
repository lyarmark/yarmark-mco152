package yarmark.connect4;

public class ColumnFullException extends RuntimeException {
	public ColumnFullException() {
		super("column full");
	}
}
