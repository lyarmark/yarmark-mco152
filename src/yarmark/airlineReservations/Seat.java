package yarmark.airlineReservations;

public class Seat {
	private int row;
	private char column;

	public Seat(char column, int row) {
		this.column = column;
		this.row = row;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.row);
		sb.append(this.column);
		return sb.toString();
	}

	@Override
	public boolean equals(Object obj) {
		//change this
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
//change this
		return super.hashCode();
	}
	
	
}
