package topinterviewquestions.array;

public class SingleNumber {

	public int singleNumber(int[] nums) {
		
		int xorValue = 0;
		
		for(int num : nums) {
			xorValue ^= num;
		}
		
		return xorValue;
		
	}
	
	public static void main(String[] args) {
		System.out.println(new SingleNumber().singleNumber(new int[] { 4, 1, 2, 1, 2 }));
	}

}
