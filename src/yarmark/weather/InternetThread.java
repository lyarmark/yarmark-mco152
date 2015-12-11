package yarmark.weather;

import java.io.IOException;

public class InternetThread extends Thread {
	String zip;
	WeatherConnection connection;

	public InternetThread(String zip) {
		this.zip = zip;
	}

	public void run() {
		try {
			this.connection = new WeatherConnection(zip);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
