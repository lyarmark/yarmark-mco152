package yarmark.pi;

import javax.swing.JLabel;

public class PiCalculationThread extends Thread{
	private JLabel label;
	
	public PiCalculationThread(JLabel label) {
		this.label = label;
	}
	
	public void run() {
		//this is the code that will execute on a different thread than the main thread
		
		PiCalculator calc = new PiCalculator();
		double pi = calc.calculate(1000000000L);
		this.label.setText(String.valueOf(pi));
	}
}
