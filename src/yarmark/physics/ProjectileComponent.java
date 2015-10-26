package yarmark.physics;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

import javax.swing.JComponent;

public class ProjectileComponent extends JComponent {

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		Projectile p = new Projectile(31, 20, 0);
		double x1 = p.getX();
		double y1 = p.getY();

		for (int i = 0; p.getY() >= 0; i++) {
			p.setTime(i + 1);
			g2.draw(new Line2D.Double(x1, getHeight() - y1, p.getX(), getHeight() - p.getY()));
			x1 = p.getX();
			y1 = p.getY();
		}
	}
}
