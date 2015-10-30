package yarmark.physics;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class ProjectileGui extends JFrame {

	private JLabel angle;
	private JLabel velocity;
	private JLabel time;

	private JTextField textFieldAngle;
	private JTextField textFieldVelocity;
	private JTextField textFieldTime;

	private JButton compute;
	private JLabel x;
	private JLabel answer;

	public ProjectileGui() {
		setTitle("ProjectileGui");
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container container = getContentPane();

		setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));

		this.angle = new JLabel("Angle:");
		this.textFieldAngle = new JTextField();
		this.velocity = new JLabel("Velocity");
		this.textFieldVelocity = new JTextField();
		this.time = new JLabel("Time");
		this.textFieldTime = new JTextField();
		this.compute = new JButton("Compute");
		this.x = new JLabel("X:");
		this.answer = new JLabel();

		add(angle);
		add(textFieldAngle);
		add(velocity);
		add(textFieldVelocity);
		add(time);
		add(textFieldTime);
		add(compute);
		add(x);
		add(answer);

		compute.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Projectile p = new Projectile(Double.parseDouble(textFieldAngle.getText()), Double
						.parseDouble(textFieldVelocity.getText()), Double.parseDouble(textFieldTime.getText()));
				String s = p.getX() + ", " + p.getY();
				answer.setText(s);
			}
		});

	}
}