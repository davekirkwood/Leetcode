package problems;

public class StringToInteger {
	
	public int myAtoi(String s) {

		int result = 0;
		boolean minus = false;
		boolean started = false;
		
		for(char c : s.toCharArray()) {
			if(c == ' ' && !started) {
				
			} else if(c == '+' && !started) {
				started = true;
			} else if(c == '-' && !started) {
				minus = true;
				started = true;
			} else if(Character.isDigit(c)) {
				started = true;
				int digit = Integer.valueOf(Character.valueOf(c).toString());
				if(minus) {
					digit = 0-digit;
				}
				int newResult = result * 10 + digit;
				if((newResult - digit) / 10 != result) {
					return -1;		// If minus, return integer.minvalue else integer.maxvalue
				}
				
			} else {
				break;
			}
		}
		return result;
		
	}

	public static void main(String[] args) {
		
		
		System.out.println(new StringToInteger().myAtoi("-91283472332"));		//-2147483648
//		System.out.println(new StringToInteger().myAtoi("2147483648"));		//2147483647
////		
//		System.out.println(new StringToInteger().myAtoi("+42"));		//42
//		System.out.println(new StringToInteger().myAtoi(" +42"));	//-42
//		System.out.println(new StringToInteger().myAtoi("    -42"));	//-42
//		System.out.println(new StringToInteger().myAtoi("+1338c0d3"));	//1337
//		System.out.println(new StringToInteger().myAtoi("+0-1"));			//0
//		System.out.println(new StringToInteger().myAtoi("words and 987"));		//0
//		System.out.println(new StringToInteger().myAtoi("+1234567890abc"));		//1234567890
//		System.out.println(new StringToInteger().myAtoi("9234567890abc"));		//2147483647
//		System.out.println(new StringToInteger().myAtoi("-1234567890abc"));		//-1234567890
//		System.out.println(new StringToInteger().myAtoi("-9234567890abc"));		//-2147483648
	}
	
	
}
