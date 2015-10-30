package yarmark.physics;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

import javax.swing.JComponent;

@SuppressWarnings("serial")
public class ProjectileComponent extends JComponent {
	private int angle = 31;
	private int velocity = 20;
	private int time = 0;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		Projectile p = new Projectile(angle, velocity, time);
		double x1 = p.getX();
		double y1 = p.getY();

		// to show the full arc
		// for (int i = 0; p.getY() >= 0; i++) {

		// to show the first 20 seconds of the arc
		for (int i = 0; i <= 20; i++) {
			p.setTime(i + 1);
			g2.draw(new Line2D.Double(x1, getHeight() - y1, p.getX(), getHeight() - p.getY()));
			x1 = p.getX();
			y1 = p.getY();
		}
	}
}
