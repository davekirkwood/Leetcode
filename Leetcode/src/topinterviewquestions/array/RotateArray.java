package topinterviewquestions.array;

public class RotateArray {

   public void rotate(int[] nums, int k) {
 	
   	k = k % nums.length;
   	
   	if(nums.length < 2) {
   		return;
   	}
   	
   	int[] buffer = new int[k];
   	
   	for(int i=0; i<buffer.length; i++) {
   		buffer[i] = nums[nums.length - (k-i)];
   	}
   	
   	for(int i=nums.length-k-1; i>=0; i--) {
   		nums[i+k] = nums[i];
   	}
   	
   	for(int i=0; i<buffer.length; i++) {
   		nums[i] = buffer[i];
   	}
   	
   }
	
   public static void main(String[] args) {
   	
   	int[] array = new int[] { 1, 2 };
   	
   	new RotateArray().rotate(array, 3);
   	
   	for(int a : array) {
   		System.out.print(a + " ");
   	}
   	
   	
   }
   
}
