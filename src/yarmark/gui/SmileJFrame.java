package yarmark.gui;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class SmileJFrame extends JFrame {

	// make a custom component
	// draw smiley face

	public SmileJFrame() {
		setTitle("Smile");
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		BorderLayout layout = new BorderLayout();

		Container container = getContentPane();
		container.setLayout(layout);
		// container.add(new SmileComponent(), BorderLayout.CENTER);
		container.add(new SmileComponentAnimated(), BorderLayout.CENTER);

	}

}
