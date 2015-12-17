package yarmark.weatherForecast;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JFrame;

public class WeatherJFrame extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	CityChoicePanel choicePanel;
	ForecastPanel forecastPanel;

	public WeatherJFrame() {
		setTitle("Weather Forecast");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.choicePanel = new CityChoicePanel();
		choicePanel.getEnter().addActionListener(this);

		getContentPane().add(choicePanel);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == choicePanel.getEnter()) {

			try {
				forecastPanel = new ForecastPanel(choicePanel.getCity());
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			forecastPanel.getReset().addActionListener(this);

			getContentPane().remove(choicePanel);
			getContentPane().revalidate();
			getContentPane().add(forecastPanel);
		}

		else if (e.getSource() == forecastPanel.getReset()) {
			this.choicePanel = new CityChoicePanel();
			this.choicePanel.getEnter().addActionListener(this);

			getContentPane().remove(forecastPanel);
			getContentPane().revalidate();
			getContentPane().add(choicePanel);
		}
	}
}