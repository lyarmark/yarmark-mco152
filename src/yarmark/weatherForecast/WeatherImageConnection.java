package yarmark.weatherForecast;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class WeatherImageConnection {
	BufferedImage image;

	public WeatherImageConnection(String icon) throws IOException {

		StringBuilder builder = new StringBuilder();
		builder.append("http://openweathermap.org/img/w/");
		builder.append(icon);
		builder.append(".png");

		URL url = new URL(builder.toString());
		this.image = new BufferedImage(200, 100, BufferedImage.TYPE_INT_RGB);
		this.image = ImageIO.read(url);
	}

	public Image getImage() {
		return this.image;
	}
}