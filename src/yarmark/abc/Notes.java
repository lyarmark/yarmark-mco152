package yarmark.abc;

public class Notes {
	/*
	 * Scanner does not always open a whole file
	 * use BufferedReader
	 * which has a method in.readLine(), which reads in all the stuff until the newLine character
	 *
	 * window>preferences>filter options 'save'
	 * >save options
	 * -format source code ...
	 *
	 * don't put unit tests in try catch
	 * if the code throws the exception in a test, the test passes
	 * if the code fails, you want to know it.
	 * in order to fail a test that throws an exception,
	 * put a throws clause in the method header
	 *
	 * in an assertEquals, the first number is the expected number
	 * the second number is the actual number
	 * this is important for JUnit's error message to be correct
	 *
	 * don't put absolute paths in file initialization
	 * it will fail on the professor's computer and everyone else too
	 * instead use .\FILENAME
	 * windows is not case sensitive to file names. macs are
	 *
	 * use the correct assert imports for unit tests
	 * org.JUnit
	 * pay attention to warnings in the code
	 *
	 * use assertTrue instead of AssertEquals
	 * don't reinvent the wheel by writing a binary search, or anything else that already exists
	 * Arrays.binarySearch(array, word) != 1;
	 *
	 * only use Math.pow() for doubles
	 * never call System.exit(0) instead of throwing an exception
	 * especially not in a constructor
	 * NEVER DO ANYTHING UNEXPECTED
	 *
	 *
	 */
}
