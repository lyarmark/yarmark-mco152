package yarmark.weather;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ZipChoicePanel extends JPanel {
	private static final long serialVersionUID = 1L;

	private JTextField zipcode;
	private JButton enter;

	public ZipChoicePanel() {
		setLayout(new GridLayout(0, 3));

		this.zipcode = new JTextField();
		this.enter = new JButton("Enter");

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
