package yarmark.connect4;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Connect4JFrame extends JFrame implements ActionListener {

	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;

	Game game;

	Connect4Component[][] components;

	public Connect4JFrame() {
		setTitle("Connect 4");
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		GridLayout layout = new GridLayout(7, 6);

		setLayout(layout);

		this.button1 = new JButton("Column 1");
		this.button2 = new JButton("Column 2");
		this.button3 = new JButton("Column 3");
		this.button4 = new JButton("Column 4");
		this.button5 = new JButton("Column 5");
		this.button6 = new JButton("Column 6");
		this.button7 = new JButton("Column 7");

		add(button1);
		button1.addActionListener(this);
		add(button2);
		button2.addActionListener(this);
		add(button3);
		button3.addActionListener(this);
		add(button4);
		button4.addActionListener(this);
		add(button5);
		button5.addActionListener(this);
		add(button6);
		button6.addActionListener(this);
		add(button7);
		button7.addActionListener(this);

		this.button1.addActionListener(this);
		game = new Game();
		components = new Connect4Component[layout.getRows()][layout.getColumns()];

		for (int i = 0; i < layout.getRows(); i++) {
			for (int j = 0; j < layout.getColumns(); j++) {
				components[i][j] = new Connect4Component();
				add(components[i][j]);
			}
		}

		game.playGame();

		getContentPane().setBackground(Color.yellow);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button1) {
			game.insertPiece(1);

		} else if (e.getSource() == button2) {
			System.out.println("beginning of click");
			int location = game.insertPiece(2);
			components[2][location].setColor(game.getCurrentPlayerColor());
			components[2][location].repaint();
			System.out.println("end of click");
		} else if (e.getSource() == button3) {
			game.insertPiece(3);

		} else if (e.getSource() == button4) {
			game.insertPiece(4);

		} else if (e.getSource() == button5) {
			game.insertPiece(5);

		} else if (e.getSource() == button6) {
			game.insertPiece(6);

		} else if (e.getSource() == button7) {
			game.insertPiece(7);
		}
	}
}
