package yarmark.gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import yarmark.quadraticEquation.InvalidDataException;
import yarmark.quadraticEquation.NoAnswerException;
import yarmark.quadraticEquation.QuadraticEquation;

public class QuadraticGUI extends JFrame {

	private JLabel a;
	private JLabel b;
	private JLabel c;

	private JTextField textFieldA;
	private JTextField textFieldB;
	private JTextField textFieldC;

	private JButton compute;
	private JLabel x;
	private JLabel answer;

	public QuadraticGUI() {
		setTitle("QuadraticGUI");
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container container = getContentPane();

		setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));

		this.a = new JLabel("A");
		this.textFieldA = new JTextField();
		this.b = new JLabel("B");
		this.textFieldB = new JTextField();
		this.c = new JLabel("C");
		this.textFieldC = new JTextField();
		this.compute = new JButton("Compute");
		this.x = new JLabel("X:");
		this.answer = new JLabel();

		add(a);
		add(textFieldA);
		add(b);
		add(textFieldB);
		add(c);
		add(textFieldC);
		add(compute);
		add(x);
		add(answer);

		compute.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					QuadraticEquation qe = new QuadraticEquation(Double.parseDouble(textFieldA.getText()), Double
							.parseDouble(textFieldB.getText()), Double.parseDouble(textFieldC.getText()));
					String p = qe.getPositiveX().toString() + ", " + qe.getNegativeX().toString();
					answer.setText(p);
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvalidDataException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NoAnswerException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});


	}
}