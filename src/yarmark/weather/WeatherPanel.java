package yarmark.weather;

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
		this.description = new JLabel();
		this.temperature = new JLabel( );
		this.image = new JLabel();
		this.reset = new JButton("RESET");

		InternetThread connection = new InternetThread(zipCode, description, temperature, image);
		connection.start();

		
		// cannot add an ImageIcon to a JPanel
		// put the image in a label and it becomes a regular component
		
		description.setForeground(Color.blue);
		temperature.setForeground(Color.blue);
		reset.setBackground(Color.blue);
		reset.setForeground(Color.white);

		description.setHorizontalAlignment(SwingConstants.CENTER);
		temperature.setHorizontalAlignment(SwingConstants.CENTER);
		image.setHorizontalAlignment(SwingConstants.CENTER);

		add(description);
		add(temperature);
		add(image);
		add(reset);

	}

	public JButton getReset() {
		return this.reset;
	}

}