package yarmark.weatherForecast;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

public class WeatherConnection {

	public CurrentWeather currentWeather;

	public WeatherConnection(String city) throws IOException {

		StringBuilder builder = new StringBuilder();

		builder.append("http://api.openweathermap.org/data/2.5/forecast/daily?q=");
		builder.append(city);
		builder.append("&mode=json&units=imperial&cnt=16&appid=2de143494c0b295cca9337e1e96b00e0");

		URL url = new URL(builder.toString());
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();

		InputStream in = connection.getInputStream();
		JsonReader reader = new JsonReader(new InputStreamReader(in));
		Gson gson = new Gson();

		this.currentWeather = gson.fromJson(reader, CurrentWeather.class);

		in.close();

	}

	public CurrentWeather getCurrentWeather() {
		return this.currentWeather;
	}
}