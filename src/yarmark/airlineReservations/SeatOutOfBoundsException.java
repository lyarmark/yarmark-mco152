package yarmark.airlineReservations;

public class SeatOutOfBoundsException extends Exception {

	private static final long serialVersionUID = 1L;

	public SeatOutOfBoundsException() {
		super("seat out of bounds");
	}
}
