package yarmark.airlineReservations;

import org.junit.Assert;
import org.junit.Test;

public class AirplaneSeatsTest {

	@Test
	/**
	 * Test the output of toString() on an empty plane. Do not modify this method.
	 */
	public void testToStringWithEmptyPlane() {
		AirplaneSeats seats = new AirplaneSeats(3, 4);
		Assert.assertEquals("ABCD\n" + "1 oooo\n" + "2 oooo\n" + "3 oooo\n", seats.toString());
	}

	@Test
	/**
	 * Test the output of toString() on an full plane. Do not modify this method.
	 */
	public void testToStringWithFullPlane() throws AlreadyReservedException, SeatOutOfBoundsException {
		AirplaneSeats seats = new AirplaneSeats(3, 4);
		seats.reserveAll("A1", "B1", "C1", "D1");
		seats.reserveAll("A2", "B2", "C2", "D2");
		seats.reserveAll("A3", "B3", "C3", "D3");
		Assert.assertEquals("ABCD\n" + "1 ####\n" + "2 ####\n" + "3 ####\n", seats.toString());
	}

	@Test
	/**
	 * Tests that reserve() reserves a seat correctly.
	 */
	public void testReserve() throws AlreadyReservedException, SeatOutOfBoundsException {
		AirplaneSeats seats = new AirplaneSeats(3, 4);
		seats.reserve("A1");
		// Assert.fail("Test not implemented");
	}

	@Test
	/**
	 * Tests that reserve() will throw an AlreadyReservedException if you attempt to reserve
	 * a seat twice. Do not modify this method.
	 */
	public void testReserveThrowsAlreadyReservedException() throws SeatOutOfBoundsException {
		AirplaneSeats seats = new AirplaneSeats(1, 1);
		try {
			seats.reserve("A1");
			seats.reserve("A1");
			Assert.fail("reserve() should've thrown an Exception");
		} catch (AlreadyReservedException e) {
			// This is expected so catch it so the test passes
		}
	}

	@Test
	/**
	 * Tests that reserve() will thrown a SeatOutOfBoundsException is you attempt to reserve
	 * a seat that is outside the bounds of the plane. 
	 */
	public void testReserveThrowsSeatOutOfBoundsException() throws AlreadyReservedException {
		// Assert.fail("Test not implemented");
		AirplaneSeats seats = new AirplaneSeats(3, 4);
		try {
			seats.reserve("G27");
			Assert.fail("Did not throw exception");
		} catch (SeatOutOfBoundsException e) {
			// expected
		}

	}

	@Test
	/**
	 * Tests that isFullPlane() returns false if there are empty seats on the plane. 
	 */
	public void testIsPlaneFullReturnsFalse() throws AlreadyReservedException, SeatOutOfBoundsException {
		// Assert.fail("Test not implemented");
		AirplaneSeats seats = new AirplaneSeats(3, 4);
		seats.reserve("A1");
		boolean notFull = seats.isPlaneFull();
		Assert.assertFalse(notFull);
	}

	@Test
	/**
	 * Tests that isFullPlane() returns true if there are no empty seats on the plane. 
	 */
	public void testIsPlaneFullReturnsTrue() throws AlreadyReservedException, SeatOutOfBoundsException {
		// Assert.fail("Test not implemented");
		AirplaneSeats seats = new AirplaneSeats(1, 1);
		seats.reserve("A1");
		boolean full = seats.isPlaneFull();
		Assert.assertTrue(full);
	}

	@Test
	/**
	 * Tests that reserveGroup() reserves the correct seats when called on an empty plane.
	 */
	public void testReserveGroupOnEmptyPlane() throws NotEnoughSeatsException {
		// Assert.fail("Test not implemented");
		AirplaneSeats seats = new AirplaneSeats(3, 4);
		seats.reserveGroup(3);
	}

	@Test
	/**
	 * Tests that reserveGroup() reserves the correct seats when called on a plane that has
	 * seats already reserved. For instance, on a 3,4 airplane whose "A1" is occupied, 
	 * calling reserveGroup(4) should return a list of elements ["A2", "B2", "C2", "D2"]
	 */
	public void testReserveGroupOnPartiallyFilledPlane() throws NotEnoughSeatsException, AlreadyReservedException,
			SeatOutOfBoundsException {
		// test on 3, 4 plane where a1 is full
		AirplaneSeats seats = new AirplaneSeats(3, 4);
		seats.reserve("A1");
		seats.reserveGroup(4);
	}

	@Test
	/**
	 * Tests that reserveGroup() throws NotEnoughSeatsException if there are not enough 
	 * seats available together for the group.
	 */
	public void testReserveGroupThrowsNotEnoughSeatsException() throws AlreadyReservedException,
			SeatOutOfBoundsException {
		// Assert.fail("Test not implemented");
		AirplaneSeats seats = new AirplaneSeats(3, 2);
		seats.reserve("A1");
		seats.reserve("B2");
		try {
			seats.reserveGroup(3);
			Assert.fail("did not throw exception");
		} catch (NotEnoughSeatsException e) {
			// Expected
		}
	}

}
