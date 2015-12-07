package yarmark.morseCode;

public class Main {
	public static void main(String[] args) {
		MorseCode morse = new MorseCode();
		String message = "Raizy Yarmark";
		try {
			System.out.println(morse.encode(message));
		} catch (NotFoundException e) {
			System.out.println(e.toString());
		}
	}
}
