package yarmark.weatherForecast;

import java.awt.Image;
import java.io.IOException;

public class InternetThread extends Thread {
	String city;
	String icon;
	WeatherConnection weatherConnection;
	WeatherImageConnection imageConnection;

	public InternetThread(String city) {
		this.city = city;
	}

	public void run() {
		try {
			this.weatherConnection = new WeatherConnection(city);
			this.imageConnection = new WeatherImageConnection(weatherConnection.getCurrentWeather().getWeather(0)
					.getIcon());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public CurrentWeather getCurrentWeather() {
		return this.weatherConnection.getCurrentWeather();
	}

	public Image getImage() {
		return this.imageConnection.getImage();
	}

}
