package yarmark.weather;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

public class InternetThread extends Thread {
	String zip;
	private JLabel description;
	private JLabel temperature;
	private JLabel image;

	public InternetThread(String zip, JLabel desc, JLabel temp, JLabel image) {
		this.zip = zip;
		this.description = desc;
		this.temperature = temp;
		this.image = image;
	}

	public void run() {
		try {
			URL url = new URL(
					"http://api.openweathermap.org/data/2.5/weather?zip="
							+ zip
							+ ",us&appid=c1593dac4830a9811149d7a1490a622d&units=imperial");

			HttpURLConnection connection = (HttpURLConnection) url
					.openConnection();

			BufferedReader in = new BufferedReader(new InputStreamReader(
					connection.getInputStream()));

			JsonReader reader = new JsonReader(in);
			Gson gson = new Gson();
			CurrentWeather currentWeather = gson.fromJson(reader,
					CurrentWeather.class);

			url = new URL("http://openweathermap.org/img/w/"
					+ currentWeather.getIcon(0) + ".png");

			// not sure what this line does, but the data loads faster with it
			BufferedImage bufferedImage = new BufferedImage(200, 100,
					BufferedImage.TYPE_INT_RGB);
			bufferedImage = ImageIO.read(url);

			ImageIcon icon = new ImageIcon(bufferedImage);

			this.description.setText(currentWeather.getDescription(0));
			this.temperature.setText(currentWeather.getTemperature() + " °F");
			this.image.setIcon(icon);

			in.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
