package yarmark.airlineReservations;

public class AlreadyReservedException extends Exception {

	private static final long serialVersionUID = 1L;

	public AlreadyReservedException() {
		super("seat already reserved");
	}
}
