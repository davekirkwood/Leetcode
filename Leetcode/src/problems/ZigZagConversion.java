package problems;

public class ZigZagConversion {

	public String convert(String s, int numRows) {

		if(numRows == 1 || numRows > s.length()) {
			return s;
		}
		
		StringBuilder[] rows = new StringBuilder[numRows];
		for(int i=0; i<numRows; i++) {
			rows[i] = new StringBuilder();
		}
		
		int direction = 1;
		int index = 0;
		
		for(char c : s.toCharArray()) {
			
			rows[index].append(c);
			
			if(index == 0) {
				direction = 1;
			}
			if(index == numRows-1) {
				direction = -1;
			}
			
			index += direction;
			
		}
		
		StringBuilder result = new StringBuilder();
		for(StringBuilder sb : rows) {
			result.append(sb);
		}
		
		return result.toString();
		
	}

	public static void main(String[] args) {
		
		System.out.println(new ZigZagConversion().convert("PAYPALISHIRING", 3));
		System.out.println(new ZigZagConversion().convert("PAYPALISHIRING", 4));
		System.out.println(new ZigZagConversion().convert("A", 1));
		
	}

}
