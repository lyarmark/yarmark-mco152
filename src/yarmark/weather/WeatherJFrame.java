package yarmark.weather;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JFrame;

public class WeatherJFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	ZipChoicePanel choicePanel;
	WeatherPanel weatherPanel;

	public WeatherJFrame() {
		setTitle("Weather");
		setSize(200, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.choicePanel = new ZipChoicePanel();

		choicePanel.getEnter().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					weatherPanel = new WeatherPanel(choicePanel.getZipcode());
					getContentPane().remove(choicePanel);
					getContentPane().revalidate();
					getContentPane().add(weatherPanel);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		getContentPane().add(choicePanel);
	}
}