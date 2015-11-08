package yarmark.connect4;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class Connect4Component extends JComponent {

	private int x;
	private int y;
	private int width;
	private int height;
	private Color color;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Connect4Component(Color color) {
		this.x = 5;
		this.y = 0;
		this.width = 80;
		this.height = 80;
		this.color = color;
	}

	public void paint(Graphics g, Color color) {
		super.paint(g);

		g.setColor(color);
		g.fillOval(this.x, this.y, this.width, this.height);

	}

}
