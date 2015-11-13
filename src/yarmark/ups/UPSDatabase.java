package yarmark.ups;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

/**
 * REQUIREMENT: You may not use an ArrayList (or any "List") in this class.
 */
public class UPSDatabase {

	private HashMap<Package, Location> map;

	public UPSDatabase() {
		this.map = new HashMap<Package, Location>();
	}

	/**
	 * Add a package to the specified Location
	 */
	public void addPackageToLocation(Location location, Package pkg) {
		map.put(pkg, location);
	}

	/**
	 * Update a Package's Location.
	 */
	public void updatePackageLocation(Package pkg, Location location) {
		this.addPackageToLocation(location, pkg);
	}

	/**
	 * @return a Set of Packages at the specified Location or an empty Set if
	 *         the Location doesn't exist or there are no Packages at that
	 *         Location.
	 */
	public Set<Package> getPackages(Location location) {
		HashSet<Package> set = new HashSet<Package>();
			
		for (Entry<Package, Location> s: map.entrySet()) {
			if (s.getValue().equals(location)) {
				set.add(s.getKey());
			}
		}
			return set;
		}

	/**
	 * @return the Location of a Package or null if the Package doesn't exist.
	 */
	public Location getLocation(Package pkg) {
		return map.get(pkg);
	}

}
