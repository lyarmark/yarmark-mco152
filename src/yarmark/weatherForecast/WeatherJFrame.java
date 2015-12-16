package yarmark.weatherForecast;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JFrame;

public class WeatherJFrame extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	CityChoicePanel choicePanel;
	WeatherPanel weatherPanel;

	public WeatherJFrame() {
		setTitle("Weather");
		setSize(250, 175);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.choicePanel = new CityChoicePanel();
		choicePanel.getEnter().addActionListener(this);

		getContentPane().add(choicePanel);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == choicePanel.getEnter()) {
			try {
				weatherPanel = new WeatherPanel(choicePanel.getCity());
				weatherPanel.getReset().addActionListener(this);

				getContentPane().remove(choicePanel);
				getContentPane().revalidate();
				getContentPane().add(weatherPanel);

			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

		else if (e.getSource() == weatherPanel.getReset()) {
			this.choicePanel = new CityChoicePanel();
			this.choicePanel.getEnter().addActionListener(this);

			getContentPane().remove(weatherPanel);
			getContentPane().revalidate();
			getContentPane().add(choicePanel);
		}
	}
}