package topinterviewquestions.array;

public class MoveZeros {

   public void moveZeroes(int[] nums) {
      
   	int nzi = 0;
   	
   	for(int i=0; i<nums.length; i++) {
   		if(nums[i] != 0) {
   			nums[nzi] = nums[i];
   			if(nzi != i) {
   				nums[i] = 0;
   			}
   			nzi++;
   		}
   	}
   	
   }
   
   public static void main(String[] args) {
   	
   	int[] set = new int[] { 2,1 };
   	new MoveZeros().moveZeroes(set);
   	for(int r : set) {
   		System.out.print(r + " ");
   	}
   	
   }
	
}
