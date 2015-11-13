package yarmark.connect4;

public class ColumnFullException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ColumnFullException() {
		super("column full");
	}
}
