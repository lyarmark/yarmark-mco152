package yarmark.weatherForecast;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CityChoicePanel extends JPanel {
	private static final long serialVersionUID = 1L;

	private JLabel directions;
	private JTextField city;
	private JButton enter;

	public CityChoicePanel() {
		setLayout(new GridLayout(0, 1));

		this.directions = new JLabel("Enter a city:");
		this.city = new JTextField();
		this.enter = new JButton("Enter");

		directions.setOpaque(true);
		directions.setBackground(Color.white);
		directions.setForeground(Color.blue);
		enter.setBackground(Color.white);
		enter.setForeground(Color.blue);

		directions.setHorizontalAlignment(SwingConstants.CENTER);
		city.setHorizontalAlignment(SwingConstants.CENTER);

		directions.setFont(new Font("Broadway", Font.BOLD, 48));
		city.setFont(new Font("Elephant", Font.BOLD, 48));
		enter.setFont(new Font("Broadway", Font.BOLD, 48));

		add(directions);
		add(city);
		add(enter);

	}

	public JButton getEnter() {
		return this.enter;
	}

	public String getCity() {
		return this.city.getText();
	}
}
