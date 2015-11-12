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

		// parameters start from 0. 8 rows, 7 columns
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

		game = new Game();

		// getRows and getColumns return count from 0
		// need to increment to have correct size array
		int row = layout.getRows();
		int col = layout.getColumns();

		// rows is 7, columns is 6. we want [6][7]
		components = new Connect4Component[layout.getRows() - 1][layout.getColumns() + 1];

		for (int i = 0; i < components.length; i++) {
			for (int j = 0; j < components[i].length; j++) {
				components[i][j] = new Connect4Component(Color.white);
				add(components[i][j]);
			}
		}

		game.playGame();

		getContentPane().setBackground(Color.yellow);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button1) {
			try {

				int location = game.insertPiece(0);

				components[location][0].setColor(game.getCurrentPlayerColor());
				components[location][0].repaint();
				game.setCurrentPlayer();

			} catch (ColumnFullException e1) {
				System.out.println(e1.toString());

			}

		} else if (e.getSource() == button2) {
			try {
				int location = game.insertPiece(1);

				components[location][1].setColor(game.getCurrentPlayerColor());
				components[location][1].repaint();
				game.setCurrentPlayer();

			} catch (ColumnFullException e1) {
				System.out.println(e1.toString());

			}
		} else if (e.getSource() == button3) {
			try {
				int location = game.insertPiece(2);

				components[location][2].setColor(game.getCurrentPlayerColor());
				components[location][2].repaint();
				game.setCurrentPlayer();

			} catch (ColumnFullException e1) {
				System.out.println(e1.toString());

			}

		} else if (e.getSource() == button4) {
			try {
				int location = game.insertPiece(3);

				components[location][3].setColor(game.getCurrentPlayerColor());
				components[location][3].repaint();
				game.setCurrentPlayer();

			} catch (ColumnFullException e1) {
				System.out.println(e1.toString());

			}

		} else if (e.getSource() == button5) {
			try {
				int location = game.insertPiece(4);

				components[location][4].setColor(game.getCurrentPlayerColor());
				components[location][4].repaint();
				game.setCurrentPlayer();

			} catch (ColumnFullException e1) {
				System.out.println(e1.toString());

			}

		} else if (e.getSource() == button6) {
			try {
				int location = game.insertPiece(5);

				components[location][5].setColor(game.getCurrentPlayerColor());
				components[location][5].repaint();
				game.setCurrentPlayer();

			} catch (ColumnFullException e1) {
				System.out.println(e1.toString());

			}

		} else if (e.getSource() == button7) {
			try {
				int location = game.insertPiece(6);

				components[location][6].setColor(game.getCurrentPlayerColor());
				components[location][6].repaint();
				game.setCurrentPlayer();

			} catch (ColumnFullException e1) {
				System.out.println(e1.toString());

			}
		}
	}
}
