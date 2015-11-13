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
		sb.append(this.column);
		sb.append(this.row);
		return sb.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seat other = (Seat) obj;
		if (row != other.row)
			return false;
		if (column != other.column)
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result;
		result = prime * result;
		return result;
	}
}
