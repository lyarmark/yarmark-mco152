package yarmark.gui;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class Connect4Component extends JComponent {

	@Override
	public void paint(Graphics g) {
		super.paint(g);

		g.setColor(Color.GRAY);
		g.fillOval(0, 0, 85, 85);

	}

}
