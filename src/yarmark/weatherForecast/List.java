package yarmark.weatherForecast;

public class List {
	private Weather[] weather;
	private Temp temperature;

	public Weather getWeather(int i) {
		return weather[i];
	}

	public Temp getTemp(int i) {
		return temperature;
	}
}
