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

	public int insertPiece(int column) throws ColumnFullException {
		for (int row = board.length - 1; row >= 0; row--) {
			if (board[row][column] == 0) {
				board[row][column] = this.currentPlayer.getNumber();
				// offset by 1 because GUI array has buttons
				return row;
			}
		}
		throw new ColumnFullException();
	}

	public Color getCurrentPlayerColor() {
		return this.currentPlayer.getColor();
	}

	public void setCurrentPlayer() {
		if (this.currentPlayer.equals(this.player1)) {
			this.currentPlayer = this.player2;
		} else {
			this.currentPlayer = this.player1;
		}
	}

	private boolean winner() {
		return false;
	}
}
