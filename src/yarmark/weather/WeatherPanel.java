package yarmark.weather;

import java.awt.GridLayout;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WeatherPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel description;
	private JLabel temperature;
	private JLabel image;

	public WeatherPanel(String zipCode) throws IOException {
		setLayout(new GridLayout());

		WeatherConnection weatherConnection;
		weatherConnection = new WeatherConnection(zipCode);
		CurrentWeather currentWeather = weatherConnection.getCurrentWeather();

		String d = currentWeather.getDescription(0);// get description
		String t = currentWeather.getTemperature();// get temperature

		this.description = new JLabel(d);
		this.temperature = new JLabel(t);

		WeatherImageConnection imageConn = new WeatherImageConnection(currentWeather.getIcon(0));

		// cannot add an ImageIcon to a JPanel
		// put the image in a label and it becomes a regular component
		this.image = new JLabel(new ImageIcon(imageConn.getImage()));

		add(description);
		add(temperature);
		add(image);

	}
}