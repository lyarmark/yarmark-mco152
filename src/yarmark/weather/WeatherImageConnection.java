package yarmark.weather;

import java.awt.Image;
import java.io.IOException;
import java.net.URL;

public class WeatherImageConnection {
	Image image;

	public WeatherImageConnection() throws IOException {

		StringBuilder builder = new StringBuilder();
		builder.append("http://openweathermap.org/img/w/10d.png");

		URL url = new URL(builder.toString());
		// HttpURLConnection connection = (HttpURLConnection)
		// url.openConnection();
		this.image = (Image) url.getContent();
	}

	public Image getImage() {
		return this.image;
	}
}