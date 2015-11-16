package yarmark.ups;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * REQUIREMENT: You may not use an ArrayList (or any "List") in this class.
 */
public class UPSDatabase {

	private HashMap<Package, Location> map;
	private HashMap<Location, Set<Package>> map2;

	public UPSDatabase() {
		this.map = new HashMap<Package, Location>();
		this.map2 = new HashMap<Location, Set<Package>>();
	}

	/**
	 * Add a package to the specified Location
	 */
	public void addPackageToLocation(Location location, Package pkg) {
		map.put(pkg, location);
		if (map2.containsKey(location)) {
			map2.get(location).add(pkg);
		} else {
			map2.put(location, new HashSet<Package>());
			map2.get(location).add(pkg);
		}
	}

	/**
	 * Update a Package's Location.
	 */
	public void updatePackageLocation(Package pkg, Location location) {
		Location old = map.get(pkg);
		map2.get(old).remove(pkg);
		this.addPackageToLocation(location, pkg);

	}

	/**
	 * @return a Set of Packages at the specified Location or an empty Set if
	 *         the Location doesn't exist or there are no Packages at that
	 *         Location.
	 */
	public Set<Package> getPackages(Location location) {
		HashSet<Package> set = new HashSet<Package>();
		if (map2.get(location) == null) {
			return set;
		} else {
			return map2.get(location);
		}
	}

	/**
	 * @return the Location of a Package or null if the Package doesn't exist.
	 */
	public Location getLocation(Package pkg) {
		return map.get(pkg);
	}

}
