package yarmark.abc;

public class PatternRegex {
	// check the java pattern class for which characters you can use
	//http://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html
	
	/*
	 * allows for a possible '1', followed by any combination of 10 digits
	 * 1?\d{10}
	 * 
	 * allows for a possible '1', followed by a digit btw. 2-9, followed by 9
	 * digits 1?[2-9]\d{9}
	 * 
	 * allows for a possible '1', followed by a digit btw. 2-9, followed by 2
	 * digits,followed by a digit btw. 2-9, followed by 6 digits
	 * 1?[2-9]\d{2}[2-9]\d{6}
	 * 
	 * allows for a possible '1',
	 * followed by a possible '-', followed by a possible '('
	 * followed by a digit btw. 2-9, followed by 2 digits,
	 * followed by a possible ')', followed by a possible '-'
	 * followed by a possible '-', followed by a possible '('
	 * followed by a digit btw. 2-9, followed by 2 digits
	 * followed by a possible ')', followed by a possible '-'
	 * followed by 4 digits
	 * followed by a possible ')'
	 * 1?-?\(?[2-9]\d{2}\)?-?\(?[2-9]\d{2}\)?-?\(?\d{4}\)?
	 */
}
