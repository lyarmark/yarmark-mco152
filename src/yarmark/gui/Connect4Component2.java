package yarmark.gui;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class Connect4Component2 extends JComponent {

	private Color color;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void paint(Graphics g) {
		super.paint(g);

		g.setColor(Color.white);
		g.fillOval(0, 0, 80, 80);
	}

	public void paint(Graphics g, Color color) {
		this.paint(getGraphics());
	}

	public void setColor(Color color) {
		this.color = color;
		repaint();
	}

}
