package yarmark.weatherForecast;

import java.awt.Color;
import java.awt.Font;
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
		this.description = new JLabel();
		this.temperature = new JLabel();
		this.image = new JLabel();

		InternetThread thread = new InternetThread(city, day, description, temperature, image);
		thread.start();

		description.setForeground(Color.blue);
		temperature.setForeground(Color.blue);

		description.setFont(new Font("Papyrus", Font.ITALIC, 16));
		temperature.setFont(new Font("Rockwell", Font.BOLD, 20));

		description.setHorizontalAlignment(SwingConstants.CENTER);
		temperature.setHorizontalAlignment(SwingConstants.CENTER);
		image.setHorizontalAlignment(SwingConstants.CENTER);

		add(description);
		add(temperature);
		add(image);

		this.setBackground(Color.PINK);
	}
}
