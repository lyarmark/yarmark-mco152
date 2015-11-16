package yarmark.connect4;

import java.awt.Color;

public class Game {

	private Player player1;
	private Player player2;
	private Player currentPlayer;
	private Board board;

	public Game() {
		this.player1 = new Player(Color.red, 1);
		this.player2 = new Player(Color.black, 2);
		this.currentPlayer = this.player1;
		this.board = new Board(6, 7);
	}

	public int insertPiece(int column) throws ColumnFullException {
		return this.board.insertPiece(column, this.currentPlayer.getNumber());
	}

	public boolean gameOver(int row, int column) {
		boolean winner = board.winner(row, column, currentPlayer.getNumber());
		if (!winner) {
			return board.draw();
		} else {
			return winner;
		}
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
}
