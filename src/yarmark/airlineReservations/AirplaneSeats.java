package yarmark.airlineReservations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

/**
 * This class is part of an Airline Reservation system. It holds seats that are
 * reserved. You are allowed to add your own member variables and private
 * methods.
 */
public class AirplaneSeats {

	private HashMap<Seat, Boolean> map;
	private int rows;
	private int columns;
	private HashMap<Integer, Character> alphabet;

	/**
	 * @param rows
	 *            the number of rows of seats on the plane.
	 * @param columns
	 *            the number of columns of seats on the plane.
	 */
	public AirplaneSeats(int rows, int columns) {

		this.rows = rows;
		this.columns = columns;

		alphabet = new HashMap<Integer, Character>();
		fillAlphabet();

		map = new HashMap<Seat, Boolean>();

		for (int row = 1; row <= rows; row++) {
			for (int column = 1; column <= columns; column++) {
				// why is the seat 1A instead of A1?
				map.put(new Seat(this.alphabet.get(column), row), false);

			}
		}
	}

	/**
	 * @param seatName
	 *            is a String in the form of "A1" where "A" is the column and 1
	 *            is the row. The first row on the plane is 1.
	 * @throws AlreadyReservedException
	 *             if the seat has already been reserved
	 * @throws SeatOutOfBoundsException
	 *             if the seat is outside the columns and rows set in the
	 *             constructor
	 */
	public void reserve(String seatName) throws AlreadyReservedException, SeatOutOfBoundsException {
		Seat temp = new Seat(seatName.charAt(0), Integer.parseInt(String.valueOf(seatName.charAt(1))));

		// out of bounds
		if (map.get(temp) == false) {
			map.put(temp, true);
		}

		// seat available
		else if (!map.containsKey(temp)) {
			throw new SeatOutOfBoundsException();
		}

		// reserved
		else {
			throw new AlreadyReservedException();
		}
	}

	/**
	 * @param seatName
	 *            is a String in the form of "A1" where "A" is the column and 1
	 *            is the row. The first row on the plane is 1.
	 * @return true if the seat has been reserved, otherwise false.
	 */
	public boolean isReserved(String seatName) {
		return map.get(seatName);
	}

	/**
	 * Reserve all seats in the array of seatNames. This is provided her for
	 * convenience of testing. Do not modify this method.
	 * 
	 * @param seatNames
	 *            is an array of seatNames
	 * @throws AlreadyReservedException
	 *             if one of the seats has already been reserved
	 * @throws SeatOutOfBoundsException
	 *             if one of the seats is outside the columns and rows set in
	 *             the constructor
	 */

	public void reserveAll(String... seatNames) throws AlreadyReservedException, SeatOutOfBoundsException {
		for (String seatName : seatNames) {
			reserve(seatName);
		}
	}

	/**
	 * This method is worth 10 points.
	 * 
	 * @return a String representation of reserved and empty seats on the plane
	 *         in the form of.
	 * 
	 *         ABCD\n 1 #oo#\n 2 #ooo\n 3 ###o\n 4 ##oo\n 5 #ooo\n
	 * 
	 *         Where o is an empty seat and # is a reserved seat.
	 * 
	 */

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		for (int i = this.columns; i <= this.columns; i++) {
			sb.append(map.get(i));
		}

		sb.append("\n");

		for (int row = 1; row <= rows; row++) {
			for (int column = 1; column <= columns; column++) {
				// change this
				if (map.getValue() == false) {
					sb.append("o");
				} else {
					sb.append("#");
				}
				sb.append("\n");

			}
		}
		return sb.toString();
	}

	/**
	 * This method is worth 10 points Reserve a group of seats in the same row.
	 * For instance, on a 3,4 airplane whose "A1" is occupied, calling
	 * reserveGroup(4) should return a list of elements ["A2", "B2", "C2", "D2"]
	 * 
	 * @param numberOfSeatsTogether
	 *            the number of seats to look for that are together
	 * @return an ArrayList of seatNames of the seats that have been reserved.
	 * @throws NotEnoughSeatsException
	 *             if there are not enough seats together to reserve.
	 */
	public ArrayList<String> reserveGroup(int numberOfSeatsTogether) throws NotEnoughSeatsException {

		for (int row = 1; row <= this.rows; row++) {

			ArrayList<String> group = new ArrayList<String>();

			for (int col = 1; col <= this.columns; col++) {
				Seat temp = new Seat(alphabet.get(col), row);

				if (map.get(temp) != null) {
					if ((this.columns - col) >= numberOfSeatsTogether) {
						continue;
					} else {
						break;
					}
				}

				else {
					group.add(temp.toString());
					if (group.size() == numberOfSeatsTogether) {
						return group;
					}
				}
			}// end col for

		}// end row for

		throw new NotEnoughSeatsException();
	}

	/**
	 * @return true if the plane is full, otherwise false.
	 */
	public boolean isPlaneFull() {
		for (Entry<Seat, Boolean> s : map.entrySet()) {
			if (s.getValue() == null) {
				return false;
			}
		}
		return true;
	}

	private void fillAlphabet() {
		alphabet.put(1, 'A');
		alphabet.put(2, 'B');
		alphabet.put(3, 'C');
		alphabet.put(4, 'D');
		alphabet.put(5, 'E');
		alphabet.put(6, 'F');
		alphabet.put(7, 'G');
		alphabet.put(8, 'H');
		alphabet.put(9, 'I');
		alphabet.put(10, 'J');
		alphabet.put(11, 'K');
		alphabet.put(12, 'L');
		alphabet.put(13, 'M');
		alphabet.put(14, 'N');
		alphabet.put(15, 'O');
		alphabet.put(16, 'P');
		alphabet.put(17, 'Q');
		alphabet.put(18, 'R');
		alphabet.put(19, 'S');
		alphabet.put(20, 'T');
		alphabet.put(21, 'U');
		alphabet.put(22, 'V');
		alphabet.put(23, 'W');
		alphabet.put(24, 'X');
		alphabet.put(25, 'Y');
		alphabet.put(26, 'Z');
	}

}
