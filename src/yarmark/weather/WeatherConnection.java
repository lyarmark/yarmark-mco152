package yarmark.weather;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import yarmark.ufo.UFOSightingList;

import com.google.gson.Gson;

public class WeatherConnection {

	/*
	 * currentweather object contains weather array and main object
	 */

	public WeatherConnection(String zip) throws IOException {

		StringBuilder builder = new StringBuilder();

		builder.append("http://api.openweathermap.org/data/2.5/weather?zip=");
		builder.append(zip);
		builder.append(",us&appid=2de143494c0b295cca9337e1e96b00e0&units=imperial");

		URL url = new URL(builder.toString());
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();

		InputStream in = connection.getInputStream();
		
		Gson gson = new Gson();

		CurrentWeather currentWeather = gson.toJson();

		in.close();

		
	}
}