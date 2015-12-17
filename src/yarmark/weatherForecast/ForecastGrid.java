package yarmark.weatherForecast;

import java.awt.GridLayout;
import java.io.IOException;

import javax.swing.JPanel;

public class ForecastGrid extends JPanel {
	private static final long serialVersionUID = 1L;

	private WeatherPanel[] weatherPanels;

	public ForecastGrid(String city) throws IOException {
		setLayout(new GridLayout(4, 4));
		this.weatherPanels = new WeatherPanel[16];

		for (int i = 0; i < weatherPanels.length; i++) {
			weatherPanels[i] = new WeatherPanel(city, i);
			add(weatherPanels[i]);
		}
	}
}
