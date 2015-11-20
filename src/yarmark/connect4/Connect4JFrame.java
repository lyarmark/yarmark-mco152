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
		setSize(700, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);

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
			buttons[i].setBackground(game.getCurrentPlayerColor());
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
		int choice = JOptionPane.showOptionDialog(null, "Game Over!", "Game Over", JOptionPane.YES_NO_OPTION,
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

	private void setButtonColor() {
		for (int i = 0; i < buttons.length; i++) {
			buttons[i].setBackground(game.getCurrentPlayerColor());
		}
	}

	private void onClick(int column) {
		try {

			int location = game.insertPiece(column);

			components[location][column].setColor(game.getCurrentPlayerColor());
			components[location][column].repaint();
			if (!game.gameOver(location, column)) {
				game.setCurrentPlayer();
				setButtonColor();
			} else {
				this.choice();
			}

		} catch (ColumnFullException e1) {
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == buttons[0]) {
			onClick(0);

		} else if (e.getSource() == buttons[1]) {
			onClick(1);

		} else if (e.getSource() == buttons[2]) {
			onClick(2);

		} else if (e.getSource() == buttons[3]) {
			onClick(3);

		} else if (e.getSource() == buttons[4]) {
			onClick(4);
			
		} else if (e.getSource() == buttons[5]) {
			onClick(5);

		} else if (e.getSource() == buttons[6]) {
			onClick(6);
		}
	}
}
