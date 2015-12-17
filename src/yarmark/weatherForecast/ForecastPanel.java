package yarmark.weatherForecast;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ForecastPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	private ForecastGrid forecastGrid;
	private JButton reset;

	public ForecastPanel(String city) throws IOException {
		setLayout(new BorderLayout());
		this.forecastGrid = new ForecastGrid(city);
		this.reset = new JButton("RESET");

		this.reset.setForeground(Color.white);
		this.reset.setBackground(Color.blue);

		reset.setFont(new Font("Broadway", Font.BOLD, 36));

		add(forecastGrid, BorderLayout.CENTER);
		add(reset, BorderLayout.SOUTH);

	}

	public JButton getReset() {
		return this.reset;
	}
}
