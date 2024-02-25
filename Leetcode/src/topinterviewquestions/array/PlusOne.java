package topinterviewquestions.array;

public class PlusOne {

   public int[] plusOne(int[] digits) {
      
   	boolean carry = false;
   	
   	for(int i=digits.length - 1; i>=0; i--) {
   		int digit = digits[i] + 1;
   		if(digit == 10) {
   			digit = 0;
   			carry = true;
   		} else {
   			carry = false;
   		}
   		digits[i] = digit;
   		if(!carry) {
   			return digits;
   		}
   	}
   	
   	if(carry) {
   		int[] result = new int[digits.length + 1];
   		result[0] = 1;
   		return result;
   	}
   	
		return digits;
   	
   }
   
   public static void main(String[] args) {
   	
   	int[] result = new PlusOne().plusOne(new int[] { 9, 9, 9 });
   	for(int r : result) {
   		System.out.print(r + "");
   	}
   	System.out.println();
   	
   }
	
}
