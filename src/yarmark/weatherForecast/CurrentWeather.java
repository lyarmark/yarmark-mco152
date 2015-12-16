package yarmark.weatherForecast;

public class CurrentWeather {
	private List[] list;

	public Weather getWeather(int i) {
		return list[i].getWeather(i);
	}

	public Temp getTemp(int i) {
		return list[i].getTemp(i);
	}
}
