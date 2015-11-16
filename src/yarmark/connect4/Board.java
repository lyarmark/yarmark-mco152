package yarmark.connect4;

public class Board {

	private int[][] board;

	public Board(int rows, int columns) {
		this.board = new int[rows][columns];
	}

	public int insertPiece(int column, int player) throws ColumnFullException {
		for (int row = board.length - 1; row >= 0; row--) {
			if (board[row][column] == 0) {
				board[row][column] = player;
				return row;
			}
		}
		throw new ColumnFullException();
	}

	public boolean winner(int row, int column, int player) {
		// HOW TO RETURN ALL THE WINNING COMBONATIONS

		// check column if there are at least 4 pieces in the column
		if (row < board.length - 3) {
			int inARow = 0;
			for (int r = row; r < board.length; r++) {
				if (board[r][column] == player) {
					inARow++;
					if (inARow == 4) {
						return true;
					}
				}
			}
		}

		// check row
		int start, end; // set start and end point based on move

		if (column - 3 <= 0) {
			start = 0;
		} else {
			start = column - 3;
		}

		if (column + 3 >= board[row].length - 1) {
			end = board[row].length - 1;
		} else {
			end = column + 3;
		}

		int inARow = 0;

		for (int col = column; col <= end; col++) {
			if (board[row][col] == player) {
				inARow++;
				if (inARow == 4) {
					return true;
				}
			} else {
				break;
			}
		}
		for (int col = column; col < start; col--) {
			if (board[row][col] == player) {
				inARow++;
				if (inARow == 4) {
					return true;
				}
			} else {
				break;
			}
		}
		return false;
	}

	public boolean draw() {
		for (int column = 0; column < this.board.length; column++) {
			if (board[0][column] == 0) {
				return false;
			}
		}
		return true;
	}
}
