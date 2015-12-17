package yarmark.weatherForecast;

import java.awt.Color;
import java.awt.GridLayout;
import java.io.IOException;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class WeatherJPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	private JLabel description;
	private JLabel temperature;
	private JLabel image;

	public WeatherJPanel(String city, int day) throws IOException {
		setLayout(new GridLayout(3, 0));

		InternetThread thread = new InternetThread(city, day, description, temperature, image);
		thread.start();

		description.setForeground(Color.blue);
		temperature.setForeground(Color.blue);

		description.setHorizontalAlignment(SwingConstants.CENTER);
		temperature.setHorizontalAlignment(SwingConstants.CENTER);

		add(description);
		add(temperature);
		add(image);

	}
}
