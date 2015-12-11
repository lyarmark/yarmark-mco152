package yarmark.weather;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ZipChoicePanel extends JPanel {
	private static final long serialVersionUID = 1L;

	private JLabel directions;
	private JTextField zipcode;
	private JButton enter;

	public ZipChoicePanel() {
		setLayout(new GridLayout(0, 1));

		this.directions = new JLabel("Enter a zipcode:");
		this.zipcode = new JTextField();
		this.enter = new JButton("Enter");

		directions.setOpaque(true);
		directions.setBackground(Color.white);
		directions.setForeground(Color.blue);
		enter.setBackground(Color.white);
		enter.setForeground(Color.blue);

		directions.setHorizontalAlignment(SwingConstants.CENTER);

		add(directions);
		add(zipcode);
		add(enter);

	}

	public JButton getEnter() {
		return this.enter;
	}

	public String getZipcode() {
		return this.zipcode.getText();
	}
}
