package yarmark.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class SmileJFrame extends JFrame implements MouseMotionListener {

	//make a custom component
	//draw smiley face

	public SmileJFrame() {
		setTitle("Smile");
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		BorderLayout layout = new BorderLayout();

		Container container = getContentPane();
		container.setLayout(layout);
		//container.add(new SmileComponent(), BorderLayout.CENTER);
		container.add(new SmileComponentAnimated(), BorderLayout.CENTER);

	}

	
	private Point eventOutput(MouseEvent e) {
		Point point = new Point (e.getX(), e.getY());
		return point;
		}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		eventOutput(e);
		
	}
}
