package yarmark.weatherForecast;

public class CurrentWeather {
	private List[] list;

	public Weather getWeather(int i) {
		return list[i].getWeather();
	}

	public Temp getTemp(int i) {
		return list[i].getTemp();
	}
}
