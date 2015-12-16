package yarmark.weatherForecast;

import java.awt.Color;
import java.awt.GridLayout;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class WeatherPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel description;
	private JLabel temperature;
	private JLabel image;
	private JButton reset;

	public WeatherPanel(String zipCode) throws IOException {
		setLayout(new GridLayout(4, 0));

		InternetThread connection = new InternetThread(zipCode);
		connection.run();

		CurrentWeather currentWeather = connection.getCurrentWeather();

		String d = currentWeather.getWeather(0).getDescription();// get description
		String t = currentWeather.getTemp(0).getDay();// get temperature

		this.description = new JLabel("Description: " + d);
		this.temperature = new JLabel("Temperature: " + t + "° F");
		this.reset = new JButton("RESET");

		// cannot add an ImageIcon to a JPanel
		// put the image in a label and it becomes a regular component
		this.image = new JLabel(new ImageIcon(connection.getImage()));

		description.setForeground(Color.blue);
		temperature.setForeground(Color.blue);
		reset.setBackground(Color.blue);
		reset.setForeground(Color.white);

		description.setHorizontalAlignment(SwingConstants.CENTER);
		temperature.setHorizontalAlignment(SwingConstants.CENTER);

		add(description);
		add(temperature);
		add(image);
		add(reset);

	}

	public JButton getReset() {
		return this.reset;
	}

}