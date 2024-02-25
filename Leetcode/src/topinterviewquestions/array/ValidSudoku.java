package topinterviewquestions.array;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

	public boolean isValidSudoku(char[][] board) {

		/*
		 * Rows
		 */
		for(int x=0; x<board.length; x++) {
			if(!isValidSet(board[x])) {
				return false;
			}
		}
		
		/*
		 * Columns
		 */
		for(int x=0; x<board.length; x++) {
			char[] column = new char[board[x].length];
			for(int y=0; y<board[x].length; y++) {
				column[y] = board[y][x];
			}	
			if(!isValidSet(column)) {
				return false;
			}
		}
		
		/*
		 * Boxes
		 */
		for(int outerX=0; outerX<board.length; outerX+=3) {
			for(int outerY=0; outerY<board[outerX].length; outerY+=3) {
			
				char[] box = new char[board.length];
				int index = 0;
				
				for(int innerX=0; innerX<3; innerX++) {
					for(int innerY=0; innerY<3; innerY++) {
						box[index++] = board[innerX + outerX][innerY + outerY];
					}
				}
				if(!isValidSet(box)) {
					return false;
				}
			}
			
		}
		return true;
		
	}
	
	private boolean isValidSet(char[] set) {
		
		Set<Character> seenBefore = new HashSet<>();
		
		for(char c : set) {
			if(c == '.') {
				
			} else {
				if(seenBefore.contains(c)) {
					return false;
				}
				seenBefore.add(c);
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
   	boolean res = new ValidSudoku().isValidSudoku(new char[][] {
   				 {'5','3','.','.','7','.','.','.','.'}
   				,{'6','.','.','1','9','5','.','.','.'}
   				,{'.','9','8','.','.','.','.','6','.'}
   				,{'8','.','.','.','6','.','.','.','3'}
   				,{'4','.','.','8','.','3','.','.','1'}
   				,{'7','.','.','.','2','.','.','.','6'}
   				,{'.','6','.','.','.','.','2','8','.'}
   				,{'.','.','6','4','1','9','.','.','5'}
   				,{'.','.','.','.','8','.','.','7','9'}}
   	);
   	
   	System.out.println(res);
}

}
