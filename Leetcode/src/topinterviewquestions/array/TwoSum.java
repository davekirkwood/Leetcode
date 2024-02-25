package topinterviewquestions.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
   public int[] twoSum(int[] nums, int target) {
   
   	Map<Integer, Integer> values = new HashMap<>();
   	
   	for(int a=0; a<nums.length; a++) {
   		values.put(nums[a], a);
   	}
   	
   	for(int a=0; a<nums.length; a++) {
   		int targetValue = target - nums[a];
   		if(values.containsKey(targetValue)) {
   			if(a != values.get(targetValue)) {
   				return new int[] { a, values.get(targetValue) };
   			}
   		}
   	}
   	
   	return null;
   	
   }
   
   public static void main(String[] args) {
   	int[] result = new TwoSum().twoSum(new int[] { 2, 7, 11, 13 }, 9);
   	System.out.println(result[0] + "," + result[1]);
   }
   
}
