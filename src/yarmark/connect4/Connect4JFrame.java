package yarmark.connect4;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Connect4JFrame extends JFrame implements ActionListener {

	Game game;
	JButton[] buttons;
	Connect4Component[][] components;

	public Connect4JFrame() {
		setTitle("Connect 4");
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// parameters start from 0. 8 rows, 7 columns
		GridLayout layout = new GridLayout(7, 6);
		setLayout(layout);

		game = new Game();
		buttons = new JButton[layout.getColumns() + 1];

		// getRows and getColumns return count from 0
		// need to increment to have correct size array
		// rows is 7, columns is 6. we want [6][7]
		components = new Connect4Component[layout.getRows() - 1][layout.getColumns() + 1];

		this.fillArray(); // add buttons and Connect4Components to JFrame

		getContentPane().setBackground(Color.yellow);
	}

	private void fillArray() {
		// ad buttons
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("Column " + (i + 1));
			add(buttons[i]);
			buttons[i].addActionListener(this);
		}
		// add Connect4Components
		for (int i = 0; i < components.length; i++) {
			for (int j = 0; j < components[i].length; j++) {
				components[i][j] = new Connect4Component(Color.white);
				add(components[i][j]);
			}
		}
	}

	private void choice() {
		Object[] options = { "Play Again", "EXIT" };
		int choice = JOptionPane.showOptionDialog(null, "Player has won.", "Game Over", JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

		if (choice == 0) {
			game = new Game();

			this.getContentPane().removeAll();
			this.fillArray();
			this.getContentPane().revalidate();
			this.getContentPane().repaint();

		} else if (choice == 1) {
			this.dispose();
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == buttons[0]) {
			try {

				int location = game.insertPiece(0);

				components[location][0].setColor(game.getCurrentPlayerColor());
				components[location][0].repaint();
				if (!game.gameOver(location, 0)) {
					game.setCurrentPlayer();
				} else {
					this.choice();
				}

			} catch (ColumnFullException e1) {
				System.out.println(e1.toString());
			}

		} else if (e.getSource() == buttons[1]) {
			try {
				int location = game.insertPiece(1);

				components[location][1].setColor(game.getCurrentPlayerColor());
				components[location][1].repaint();
				if (!game.gameOver(location, 1)) {
					game.setCurrentPlayer();
				} else {
					this.choice();
				}

			} catch (ColumnFullException e1) {
				System.out.println(e1.toString());
			}

		} else if (e.getSource() == buttons[2]) {
			try {
				int location = game.insertPiece(2);

				components[location][2].setColor(game.getCurrentPlayerColor());
				components[location][2].repaint();
				if (!game.gameOver(location, 2)) {
					game.setCurrentPlayer();
				} else {
					this.choice();
				}
			} catch (ColumnFullException e1) {
				System.out.println(e1.toString());
			}

		} else if (e.getSource() == buttons[3]) {
			try {
				int location = game.insertPiece(3);

				components[location][3].setColor(game.getCurrentPlayerColor());
				components[location][3].repaint();
				if (!game.gameOver(location, 3)) {
					game.setCurrentPlayer();
				} else {
					this.choice();
				}
			} catch (ColumnFullException e1) {
				System.out.println(e1.toString());
			}

		} else if (e.getSource() == buttons[4]) {
			try {
				int location = game.insertPiece(4);

				components[location][4].setColor(game.getCurrentPlayerColor());
				components[location][4].repaint();
				if (!game.gameOver(location, 4)) {
					game.setCurrentPlayer();
				} else {
					this.choice();
				}
			} catch (ColumnFullException e1) {
				System.out.println(e1.toString());
			}

		} else if (e.getSource() == buttons[5]) {
			try {
				int location = game.insertPiece(5);

				components[location][5].setColor(game.getCurrentPlayerColor());
				components[location][5].repaint();
				if (!game.gameOver(location, 5)) {
					game.setCurrentPlayer();
				} else {
					this.choice();
				}
			} catch (ColumnFullException e1) {
				System.out.println(e1.toString());
			}

		} else if (e.getSource() == buttons[6]) {
			try {
				int location = game.insertPiece(6);

				components[location][6].setColor(game.getCurrentPlayerColor());
				components[location][6].repaint();
				if (!game.gameOver(location, 6)) {
					game.setCurrentPlayer();
				} else {
					this.choice();
				}
			} catch (ColumnFullException e1) {
				System.out.println(e1.toString());
			}
		}
	}
}
