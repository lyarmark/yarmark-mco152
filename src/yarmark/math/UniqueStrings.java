package yarmark.math;

import java.util.HashSet;

public class UniqueStrings {

	public static void main(String args[]) {

		String array[] = new String[] { "A", "B", "B", "C" };
		/*
		 * for (int i = 0; i < array.length; i++) { boolean duplicate = false;
		 * for (int k = i + 1; k < i; k++) { if (array[i].equals(array[k])) {
		 * duplicate = true; } } if (!duplicate) { System.out.print(array[i]); }
		 * }
		 */

		HashSet set = new HashSet<String>();
		for (String s : array) {
			if (!set.contains(s)) {
				System.out.println(s);
			}
			set.add(s);
		}
	}

}