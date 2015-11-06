package yarmark.connect4;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import yarmark.gui.Connect4Component;

public class Connect4JFrame extends JFrame {

	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;

	public Connect4JFrame() {
		setTitle("Connect 4");
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		GridLayout layout = new GridLayout(6, 7);
		this.setLayout(layout);

		this.button1 = new JButton("Column 1");
		this.button2 = new JButton("Column 2");
		this.button3 = new JButton("Column 3");
		this.button4 = new JButton("Column 4");
		this.button5 = new JButton("Column 5");
		this.button6 = new JButton("Column 6");
		this.button7 = new JButton("Column 7");

		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
		add(button6);
		add(button7);

		for (int i = 0; i < layout.getRows(); i++) {
			for (int j = 0; j < layout.getColumns(); j++) {
				add(new Connect4Component());
			}
		}

		getContentPane();
	}
}
