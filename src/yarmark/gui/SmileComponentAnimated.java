package yarmark.gui;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

@SuppressWarnings("serial")
public class SmileComponentAnimated extends JComponent {

	// to animate a graphics object, use an instance variable
	private int y = 310;
	private SmileJFrame panel;

	// increment the variable in the paint component

	// each call to paintComponent() is one frame

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);

		g.setColor(Color.YELLOW);
		g.fillOval(250, 250, 300, 300);

		g.setColor(Color.GREEN);
		g.fillOval(325, 325, 50, 50);

		g.setColor(Color.GREEN);
		g.fillOval(400, 325, 50, 50);

		g.setColor(Color.BLACK);
		g.drawArc(325, y, 50, 25, 0, 180);

		g.setColor(Color.BLACK);
		g.drawArc(400, y, 50, 25, 0, 180);

		g.setColor(Color.GRAY);
		g.fillOval(340, 340, 15, 15);

		g.setColor(Color.GRAY);
		g.fillOval(415, 340, 15, 15);

		g.setColor(Color.RED);
		g.drawArc(350, 450, 100, 50, 900, 180);

		y--;

		if (y == 290) {
			y = 310;
		}
		// this calls the paintcomponent method again

		super.repaint();

	}

}
