package yarmark.weather;

public class CurrentWeather {
	private Weather[] weather;
	private Main main;

	public String getDescription(int i) {
		return weather[i].getDescription();
	}

	public String getTemperature() {
		return main.getTemperature();
	}
}
