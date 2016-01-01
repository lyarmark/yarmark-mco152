package yarmark.contactList;

public class Contact implements Comparable<Contact> {

	private String name;

	public String getName() {
		return name;
	}

	public String toString() {
		return name;
	}

	@Override
	public int compareTo(Contact other) {
		String[] thisName = this.toString().split(" ");
		String[] otherName = other.toString().split(" ");

		if (thisName[thisName.length - 1].length() == 1) {
			return thisName[thisName.length - 2].compareTo(otherName[otherName.length - 1]);
		} else if (otherName[otherName.length - 1].length() == 1) {
			return thisName[thisName.length - 1].compareTo(otherName[otherName.length - 2]);
		} else {
			return thisName[thisName.length - 1].compareTo(otherName[otherName.length - 1]);
		}
	}
}
