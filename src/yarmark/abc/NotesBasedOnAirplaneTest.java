package yarmark.abc;

public class NotesBasedOnAirplaneTest {
	/*
	 * get the HashMap question right on an interview!!
	 * 
	 * ways to store seats on an airplane:
	 * 
	 * 1. 2D array of chars 2. 2D array of booleans 3. 2D array of string
	 * 
	 * because of abstraction and encapsulation, using different data types (so
	 * long as you set up the 2D array correctly) it all does the same thing
	 * 
	 * 4. HashMap <String, Boolean> 5. HashMap <String Character> 6. HashMap
	 * <String, String> 7. HashSet <String> if seat is in the set, it is
	 * reserved to print out empty seats, do a for loop based on size parameters
	 * 
	 * a map holds the key and value
	 * 
	 * can't use charAt() for seat because won't work for large seat number
	 * ex:"A100"
	 * 
	 * can't use for loop to loop through map. it won't necessarily print out in
	 * order, because the map doesn't put things in sequentially
	 * instead, loop through all possibilities (A1, B1, C1, A2, B2 ...)
	 * outer for- rows
	 * inner for- columns
	 * same double for loop as was used for adding them to the hashmap
	 */
}
