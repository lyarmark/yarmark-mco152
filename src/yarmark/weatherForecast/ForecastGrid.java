package yarmark.weatherForecast;

import java.awt.Color;
import java.awt.GridLayout;
import java.io.IOException;

import javax.swing.JPanel;

public class ForecastGrid extends JPanel {
	private static final long serialVersionUID = 1L;

	private WeatherJPanel[] weatherPanels;

	public ForecastGrid(String city) throws IOException {
		setLayout(new GridLayout(4, 4, 3, 3));
		this.weatherPanels = new WeatherJPanel[16];

		for (int i = 0; i < weatherPanels.length; i++) {
			weatherPanels[i] = new WeatherJPanel(city, i);
			add(weatherPanels[i]);
		}

		this.setBackground(Color.yellow);
	}
}
