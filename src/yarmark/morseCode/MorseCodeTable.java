package yarmark.morseCode;

public enum MorseCodeTable {
	A(".-"), B("-..."), C("-.-."), D("-.."), E("."), F("..-."), G(" --."), H("...."), I(".."), J(".---"), K(" -.-"), L(
			".-.."), M("--"), N("-."), O("---"), P(".--."), Q("--.-"), R(".-."), S("..."), T("-"), U("..-"), V("...-"), W(
			".--"), X("-..-"), Y("-.--"), Z("--.."), ;

	private String code;

	private MorseCodeTable(String code) {
		this.code = code;
	}

	public String getName() {
		return this.code;
	}
}
