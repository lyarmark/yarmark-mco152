package yarmark.weatherForecast;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
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

	public InternetThread(String city, int day, JLabel desc, JLabel temp,
			JLabel image) throws IOException {
		if (city.matches(".*\\s+.*")) {
			this.city = city.replaceAll("\\s+", "");
		} else {
			this.city = city;
		}
		this.day = day;
		this.description = desc;
		this.temperature = temp;
		this.image = image;
	}

	public void run() {
		try {
			URL url = new URL(
					"http://api.openweathermap.org/data/2.5/forecast/daily?q="
							+ city
							+ "&mode=json&units=imperial&cnt=16&appid=c1593dac4830a9811149d7a1490a622d");

			HttpURLConnection connection = (HttpURLConnection) url
					.openConnection();

			BufferedReader in = new BufferedReader(new InputStreamReader(
					connection.getInputStream()));

			JsonReader reader = new JsonReader(in);
			Gson gson = new Gson();
			if (day == 15) {
				System.out.print(15);
			}
			CurrentWeather currentWeather = gson.fromJson(reader,
					CurrentWeather.class);

			url = new URL("http://openweathermap.org/img/w/"
					+ currentWeather.getWeather(day).getIcon() + ".png");

			//not sure what this line does, but the data loads faster with it
			BufferedImage bufferedImage = new BufferedImage(200, 200,
					BufferedImage.TYPE_INT_RGB);

			bufferedImage = ImageIO.read(url);
			ImageIcon icon = new ImageIcon(bufferedImage);

			this.description.setText(currentWeather.getWeather(day)
					.getDescription());
			this.temperature.setText(currentWeather.getTemp(day).getDay()
					+ " °F");
			this.image.setIcon(icon);

			in.close();
		} catch (IOException e) {

		} catch (NullPointerException e) {
			// no city/invalid city entered
			this.temperature.setText("Invalid city");
		}

	}
}
