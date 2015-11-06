package yarmark.airlineReservations;

public class Seat {
	private int row;
	private char column;

	public Seat(char column, int row) {
		this.row = row;
		this.column = column;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.row);
		sb.append(this.column);
		return sb.toString();
	}
}
