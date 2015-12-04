package yarmark.weather;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class WeatherGui extends JFrame {

	private JTextField description;
	private JTextField temperature; 
	
	public WeatherGui() {
		setTitle("Weather");
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.description = //get something from json
				this.temperature = //get something from json
		
		getContentPane();
	}
}
