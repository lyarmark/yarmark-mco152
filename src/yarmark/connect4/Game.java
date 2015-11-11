package yarmark.connect4;

import java.awt.Color;

public class Game {

	private Player player1;
	private Player player2;
	private int[][] board;
	private Player currentPlayer;

	public Game() {
		this.player1 = new Player(Color.red, 1);
		this.player2 = new Player(Color.black, 2);
		board = new int[6][7];
		this.currentPlayer = this.player1;
	}

	public void playGame() {
		while (!winner()) {
			break;
		}

	}

	public int insertPiece(int column) {
		int column2 = column - 1;
		for (int row = board[column2].length - 1; row >= 0; row++) {
			int number = board[row][column2];
			if (board[row][column2] == 0) {
				board[row][column2] = this.currentPlayer.getNumber();
				this.currentPlayer = takeTurns(this.currentPlayer);
				return column2;
			}
			continue;
		}
		// HOW TO TEST FOR FULL COLUMN IF THE METHOD DOESN'T RETURN ANTYHING
		throw new ColumnFullException();
	}

	public Color getCurrentPlayerColor() {
		return this.currentPlayer.getColor();
	}

	private Player takeTurns(Player p) {
		if (p.equals(this.player1)) {
			return this.player2;
		} else {
			return this.player1;
		}
	}

	private boolean winner() {
		return false;
	}
}
