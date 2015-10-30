package yarmark.physics;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class ProjectileJFrame extends JFrame {

	public ProjectileJFrame() {
		setTitle("ProjectileGui");
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		BorderLayout layout = new BorderLayout();
		Container container = getContentPane();
		container.setLayout(layout);
		container.add(new ProjectileComponent(), BorderLayout.CENTER);
	}
}