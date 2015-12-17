package yarmark.weatherForecast;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

//put connection code in thread class instead of having separate connection class
public class InternetThread extends Thread {
	private String city;
	private int day;
	private JLabel description;
	private JLabel temperature;
	private JLabel image;

	public InternetThread(String city, int day, JLabel desc, JLabel temp, JLabel image) throws IOException {
		this.city = city;
		this.day = day;
		this.description = desc;
		this.temperature = temp;
		this.image = image;
	}

	public void run() {
		try {
			URL url = new URL("http://api.openweathermap.org/data/2.5/forecast/daily?q=" + city
					+ "&mode=json&units=imperial&cnt=16&appid=2de143494c0b295cca9337e1e96b00e0");

			HttpURLConnection connection = (HttpURLConnection) url.openConnection();

			InputStream in = connection.getInputStream();
			JsonReader reader = new JsonReader(new InputStreamReader(in));
			Gson gson = new Gson();

			CurrentWeather currentWeather = gson.fromJson(reader, CurrentWeather.class);

			url = new URL("http://openweathermap.org/img/w/" + currentWeather.getWeather(day).getIcon() + ".png");

			BufferedImage bufferedImage = ImageIO.read(url);

			this.description.setText(currentWeather.getWeather(day).getDescription());
			this.temperature.setText(currentWeather.getTemp(day).getDay());
			this.image = new JLabel(new ImageIcon(bufferedImage));

			in.close();
		} catch (IOException e) {

		}

	}
}
