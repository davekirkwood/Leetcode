package problems;

public class ReverseInteger {

	public int reverse(int x) {

		int result = 0;
		while(x != 0) {
			int newResult = result * 10 + x%10;
			
			if((newResult - x%10) / 10 != result) {
				return 0;
			}
			
			x /= 10;
			result = newResult;
		}
		return result;
		
	}

	public static void main(String[] args) {
		System.out.println(new ReverseInteger().reverse(123));
		System.out.println(new ReverseInteger().reverse(-123));
		System.out.println(new ReverseInteger().reverse(210));
		System.out.println(new ReverseInteger().reverse(1234567899));
	}

}
