package topinterviewquestions.array;

public class RemoveDuplicatesFromSortedArray {

   public int removeDuplicates(int[] nums) {
      
   	int offset = 0;
   	
   	for(int i=1; i<nums.length; i++) {
   		if(nums[i-1] == nums[i]) {
   			offset-=1;
   		}
   		nums[i+offset] = nums[i];
   	}
   	
   	return nums.length + offset;
   	
   }
   
   public static void main(String[] args) {
   	
   	int[] nums = { }; // Input array
   	int[] expectedNums = { }; // The expected answer with correct length

   	int k = new RemoveDuplicatesFromSortedArray().removeDuplicates(nums); // Calls your implementation

   	System.out.println(k == expectedNums.length);
   	for (int i = 0; i < k; i++) {
   		System.out.println(nums[i] == expectedNums[i]);
   	}
   	
   }
	
}
