package yarmark.weatherForecast;

public class List {
	private String dt;
	private Weather[] weather;
	private Temp temp;

	public Weather getWeather(int i) {
		return weather[i];
	}

	public Temp getTemp(int i) {
		return temp;
	}
}
