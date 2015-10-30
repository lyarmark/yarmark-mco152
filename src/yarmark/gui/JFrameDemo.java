package yarmark.gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class JFrameDemo extends JFrame {

	private JTextField textField1;
	private JTextField textField2;

	private JLabel label1;
	private JLabel label2;

	private JButton button1;
	private JButton button2;

	// Constructor
	public JFrameDemo() {
		// set title, size in pixel, default close operation
		setTitle("JFrameDemo");
		setSize(800, 600); // if undefined, the frame will not exist

		// what happens when you hit the x button
		// exitOnClose closes the frame and exits the program
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// if you forget the above line and you hit the x
		// the frame will close and the program will continue running
		// the only way to stop it is the red square in eclipse

		// container is like a JPanel
		// this method will get the default window (boxlayout needs it to
		// display)
		Container container = getContentPane();

		// setLayout(new FlowLayout());
		setLayout(new BoxLayout(container, BoxLayout.Y_AXIS)); // display
		// everything
		// vertically
		// with yaxis

		// need to initialize a variable
		// need to add the variable to the layout in order for it to be
		// displayed

		textField1 = new JTextField();
		textField1.setText("Hello");
		add(textField1);

		label1 = new JLabel("all this text can now be seen");
		add(label1);

		button1 = new JButton("CLICK ME!");

		// this is an interface
		// an interface defines constants and methods
		// which must be implemented by a class that implements the interface

		button1.addActionListener(new ActionListener() {
			//this is an anonymous class that exists only over here
			//it will have a method that will happen when the button is clicked
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("WOW! you have clicked the button!");
			}
		});

		add(button1);

		label2 = new JLabel("this is another label");
		add(label2);

		button2 = new JButton("DON'T CLICK ME!");
		add(button2);

		textField2 = new JTextField("Goodbye");
		add(textField2);

	}
}
