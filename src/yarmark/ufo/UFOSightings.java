package yarmark.ufo;

public class UFOSightings implements Comparable<UFOSightings> {

	private String sightedAt;
	private String reportedAt;
	private String location;
	private String shape;
	private String duration;
	private String description;

	public int compareTo(UFOSightings other) {
		return this.location.compareTo(other.location);
	}

	public String getLocation() {
		return this.location;
	}
}
