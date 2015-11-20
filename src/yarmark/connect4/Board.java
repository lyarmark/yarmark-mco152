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

		// check column
		// if there are at least 4 pieces in the column
		if (row < board.length - 3) {
			int inARow = 1;
			for (int r = row + 1; r < board.length; r++) {
				if (board[r][column] == player) {
					inARow++;
					if (inARow == 4) {
						return true;
					}
				} else {
					break;
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

		int inARow = 1;

		// check spaces to the right of move
		for (int col = column + 1; col <= end; col++) {
			if (board[row][col] == player) {
				inARow++;
				if (inARow == 4) {
					return true;
				}
			} else {
				break;
			}
		}
		// check spaces to the left of move
		for (int col = column - 1; col >= start; col--) {
			if (board[row][col] == player) {
				inARow++;
				if (inARow == 4) {
					return true;
				}
			} else {
				break;
			}
		}

		// check diagonal left to right
		inARow = 1;
		int startR, endR, startC, endC;
		if (column - 3 <= 0) {
			startC = 0;
		} else {
			startC = column - 3;
		}

		if (column + 3 >= board[row].length - 1) {
			endC = board[row].length - 1;
		} else {
			endC = column + 3;
		}

		if (row - 3 < 0) {
			startR = 0;
		} else {
			startR = row - 3;
		}

		if (row + 3 > board.length - 1) {
			endR = board.length - 1;
		} else {
			endR = row + 3;
		}

		//check diagonal to right, below move
		for (int r = row + 1, c = column + 1; r <= endR && c <= endC; r++, c++) {
			if (board[r][c] == player) {
				inARow++;
				if (inARow == 4) {
					return true;
				}
			} else {
				break;
			}
		}
		//check diagonal to left, above move
		for (int r = row - 1, c = column - 1; r >= startR && c >= startC; r--, c--) {
			if (board[r][c] == player) {
				inARow++;
				if (inARow == 4) {
					return true;
				}
			} else {
				break;
			}
		}

		// check diagonal right to left
		inARow = 1;	//reset inARow
		//check diagonal to left, below move
		for (int r = row + 1, c = column - 1; r <= endR && c >= startC; r++, c--) {
			if (board[r][c] == player) {
				inARow++;
				if (inARow == 4) {
					return true;
				}
			} else {
				break;
			}
		}
		//check diagonal to right, above move
		for (int r = row - 1, c = column + 1; r >= startR && c <= endC; r--, c++) {
			if (board[r][c] == player) {
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
