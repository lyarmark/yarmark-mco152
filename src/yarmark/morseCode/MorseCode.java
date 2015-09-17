package yarmark.morseCode;

public class MorseCode {
	public MorseCode() {
	}

	public String encode(String message) throws NotFoundException {
		if (!message.matches("[\\s\\dA-Za-z]*")) {
			throw new NotFoundException();
			// some of the characters you entered cannot be translated in the
			// scope of this program
		}
		String[] splitMessage = message.split(" ");
		StringBuilder encoded = new StringBuilder();
		for (int h = 0; h < splitMessage.length; h++) {
			for (int i = 0; i < splitMessage[h].length(); i++) {
				encoded.append(findEncode(splitMessage[h].toUpperCase().charAt(i)) + " ");
			}
			encoded.append("  ");
		}
		return encoded.toString().trim();
	}

	public String decode(String code) {
		String[] splitCode = code.split("   ");
		StringBuilder decoded = new StringBuilder();
		for (int h = 0; h < splitCode.length; h++) {
			String[] splitCode2 = splitCode[h].split(" ");
			for (int i = 0; i < splitCode2.length; i++) {
				decoded.append(findDecode(splitCode2[i]));
			}
			decoded.append(" ");
		}
		return decoded.toString().trim();
	}

	public String findEncode(char c) {
		return MorseCodeTable.valueOf(String.valueOf(c)).getName();
	}

	public String findDecode(String s) {
		for (MorseCodeTable code : MorseCodeTable.values()) {
			if (code.getName().equals(s)) {
				return code.toString();
			}
		}
		// couldn't find match
		return null;
	}
}
