package yarmark.connect4;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class Connect4Component extends JComponent {

	private Color color;

	public Connect4Component(Color color) {
		this.color = color;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void paint(Graphics g) {
		super.paint(g);

		g.setColor(this.color);
		g.fillOval(0, 0, 95, 95);
	}

	public void setColor(Color color) {
		this.color = color;
	}
}
