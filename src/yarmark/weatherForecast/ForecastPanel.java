package yarmark.weatherForecast;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class ForecastPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	private ForecastGrid forecastGrid;
	private JLabel label;
	private JButton reset;

	public ForecastPanel(String city) throws IOException {
		setLayout(new BorderLayout());
		this.forecastGrid = new ForecastGrid(city);
		this.label = new JLabel("16 Day forecast for " + city.toUpperCase());
		this.reset = new JButton("RESET");

		this.label.setForeground(Color.white);
		this.label.setOpaque(true);
		this.label.setBackground(Color.blue);
		this.label.setHorizontalAlignment(SwingConstants.CENTER);

		this.reset.setForeground(Color.white);
		this.reset.setBackground(Color.blue);

		label.setFont(new Font("Broadway", Font.BOLD, 22));
		reset.setFont(new Font("Broadway", Font.BOLD, 36));

		add(forecastGrid, BorderLayout.CENTER);
		add(label, BorderLayout.NORTH);
		add(reset, BorderLayout.SOUTH);
	}

	public JButton getReset() {
		return this.reset;
	}
}
