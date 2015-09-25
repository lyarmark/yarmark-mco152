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
	 * JSON is javaScript object notation
	 * it has replaced xml to pass data over the internet
	 * xml is too verbose
	 *
	 * a JSON file is a decs. of an object or array of object
	 * and object is enclosed in {}
	 * "word_goes_here": denotes a variable of String/double/integer/Object
	 * can identify if it is an object if it is followed by {}
	 *
	 * EX: in the object, have a "glossary" object
	 * "glossary": {}
	 *
	 * EXAMPLE FROM WIKIPEDIA
{
  "firstName": "John",
  "lastName": "Smith",
  "isAlive": true,
  "age": 25,
  "address": {
    "streetAddress": "21 2nd Street",
    "city": "New York",
    "state": "NY",
    "postalCode": "10021-3100"
  },
  "phoneNumbers": [
    {
      "type": "home",
      "number": "212 555-1234"
    },
    {
      "type": "office",
      "number": "646 555-4567"
    }
  ],
  "children": [],	//EMPTY ARRAY
  "spouse": null	//IF NOT NOT NULL, IT WOULD HOLD AN OBJECT
}

	 *
	 * in eclipse, use GSON parser to read in a JSON file
	 * Gson is put out by google, and is no included in the java or eclipse libraries
	 * whenever anyone uploads a library, it gets put here
	 * http://search.maven.org/#artifactdetails%7Ccom.google.code.gson%7Cgson%7C2.3.1%7Cjar
	 * drag and drop the down loaded file- gson 2.3.1 to eclipse
	 * this jar file holds the code for gson
	 * add the jar file to the build path
	 * construct a GSON class
	 *
	 *to use other libraries, copy the jar file to the project and add it to the build path
	 */
}
