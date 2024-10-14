package problems;

public class SudokuSolver {

	private static int SIZE = 9;

	private char[][] board;

	public void solveSudoku(char[][] board) {
		this.board = board;
		solve();
		
		for (int x = 0; x < SIZE; x++) {
			for (int y = 0; y < SIZE; y++) {
				System.out.print(board[x][y] + " ");
			}
			System.out.println();
		}

	}

	public boolean solve() {

		for (int x = 0; x < SIZE; x++) {
			for (int y = 0; y < SIZE; y++) {

				if (board[x][y] == '.') {

					for (char candidate = '1'; candidate <= '9'; candidate++) {

						if (candidateFits(candidate, x, y)) {
							board[x][y] = candidate;
							if (!solve()) {
								board[x][y] = '.';
							} else {
								return true;
							}
						}
					}
					return false;
				}

			}
		}
		return true;
	}

	private boolean candidateFits(char candidate, int x, int y) {

		for (int i = 0; i < SIZE; i++) {
			if (board[i][y] == candidate) {
				return false;
			}
			if (board[x][i] == candidate) {
				return false;
			}
		}

		int baseX = (x / 3) * 3;
		int baseY = (y / 3) * 3;
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				if (board[baseX + row][baseY + col] == candidate) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		char[][] board = {
				{ '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' },
				{ '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' },
				{ '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' },
				{ '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' },
				{ '.', '.', '.', '.', '8', '.', '.', '7', '9' }
		};
		new SudokuSolver().solveSudoku(board);
	}
}
