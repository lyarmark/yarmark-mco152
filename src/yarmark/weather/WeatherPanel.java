package yarmark.weather;

import java.awt.GridLayout;
import java.io.IOException;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class WeatherPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel description;
	private JLabel temperature;

	public WeatherPanel(String zipCode) throws IOException {
		setLayout(new GridLayout());
		this.description = new JLabel();
		this.temperature = new JLabel();

		WeatherConnection weatherConnection;
		weatherConnection = new WeatherConnection(zipCode);
		CurrentWeather currentWeather = weatherConnection.getCurrentWeather();

		String d = currentWeather.getDescription(0);// get description
		String t = currentWeather.getTemperature();// get temperature
		description.setText(d);
		temperature.setText(t);

		add(description);
		add(temperature);

	}
}