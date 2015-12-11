package yarmark.weather;

import java.awt.Image;
import java.io.IOException;

public class InternetThread extends Thread {
	String zip;
	String icon;
	WeatherConnection weatherConnection;
	WeatherImageConnection imageConnection;

	public InternetThread(String zip) {
		this.zip = zip;
	}

	public void run() {
		try {
			this.weatherConnection = new WeatherConnection(zip);
			this.imageConnection = new WeatherImageConnection(weatherConnection.gettCurrentWeather().getIcon(0));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public CurrentWeather getCurrentWeather() {
		return this.weatherConnection.gettCurrentWeather();
	}

	public Image getImage() {
		return this.imageConnection.getImage();
	}

}
