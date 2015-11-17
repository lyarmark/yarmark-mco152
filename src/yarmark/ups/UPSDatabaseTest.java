package yarmark.ups;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class UPSDatabaseTest {

	@Test
	/** 
	 * Add a Package to a Location. 
	 * Verify that the Package is returned with getPackages().
	 * Verify that the Location is returned with getLocation().
	 */
	public void testAddPackageToLocation() {
		UPSDatabase ups = new UPSDatabase();

		Location location = new Location(10, 20);
		Package pkg = new Package("123456");
		Package pkg2 = new Package("4567489");

		ups.addPackageToLocation(location, pkg);
		ups.addPackageToLocation(location, pkg2);

		Location getLocation = ups.getLocation(pkg);
		Set<Package> s = ups.getPackages(location);

		Assert.assertTrue(s.contains(pkg));
		Assert.assertTrue(s.contains(pkg2));
		Assert.assertTrue(s.size() == 2);

		Assert.assertEquals(location, getLocation);
	}

	@Test
	/** 
	 * Add a Package to a Location then update the Package Location to a different Location. 
	 * Verify that the Package is returned with getPackages().
	 * Verify that the Location is returned with getLocation().
	 * Verify that the Package is NOT returned when calling getPackage() with the first Location.
	 */
	public void testUpdatePackageLocation() {
		UPSDatabase ups = new UPSDatabase();

		Location location = new Location(10, 20);
		Package pkg = new Package("123456");
		ups.addPackageToLocation(location, pkg);

		Location location2 = new Location(20, 30);
		ups.updatePackageLocation(pkg, location2);

		Set<Package> s = ups.getPackages(location2);
		Assert.assertTrue(s.contains(pkg));

		Location newLocation = ups.getLocation(pkg);
		Assert.assertEquals(newLocation, ups.getLocation(pkg));

		Assert.assertTrue(!ups.getPackages(location).contains(pkg));
	}

	@Test
	/**
	 * Verify that calling getPackages() returns an empty Set when called with
	 * a Location without Packages.
	 */
	public void testGetPackagesReturnsAnEmptySet() {

		UPSDatabase ups = new UPSDatabase();
		Location location = new Location(10, 20);

		HashSet<Package> empty = new HashSet<Package>();
		Assert.assertEquals(empty, ups.getPackages(location));
	}

	@Test
	/**
	 * Verify that calling getLocation() on an unknown Package returns null.
	 */
	public void testGetLocationReturnsNull() {
		UPSDatabase ups = new UPSDatabase();
		Package pkg = new Package("123456");
		Assert.assertNull(ups.getLocation(pkg));

	}

}
