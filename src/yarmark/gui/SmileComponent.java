package yarmark.gui;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

@SuppressWarnings("serial")
public class SmileComponent extends JComponent {

	// overload- have many methods with same name and different parameters
	// override- redefine predefined method from interface or class

	// override the method that tells the component how to draw itself
	// CAN ONLY DRAW TO THE SCREEN INSIDE PAINT COMPONENT
	// can call other methods from in the paintComponent()
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);

		// there are many draw methods

		// draw a line with the (x,y) points for the endpoints
		// (0,0) is the top left corner
		// line goes down when y goes down
		// g.drawLine(0, 300, 600, 50);

		g.setColor(Color.YELLOW);
		g.fillOval(250, 250, 300, 300);
		// g.drawOval(250, 250, 300, 300);
		g.setColor(Color.GREEN);
		g.fillOval(325, 325, 50, 50);
		g.setColor(Color.GREEN);
		g.fillOval(400, 325, 50, 50);
		g.setColor(Color.RED);
		g.drawArc(350, 450, 100, 50, 900, 180);
		g.setColor(Color.PINK);
		g.fillRect(285, 225, 230, 50);
		g.setColor(Color.PINK);
		g.fillRect(300, 185, 200, 40);

		// set 100 pixel padding around the circle
		// it will resize on window resize
		// g.drawOval(100, 100, getWidth()- 200, getHeight()- 200);
	}

}
