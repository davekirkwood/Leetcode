package topinterviewquestions.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfTwoArraysII {

   public int[] intersect(int[] nums1, int[] nums2) {

   	Map<Integer, Integer> values = new HashMap<>();
   	
   	for(int num : nums1) {
   		if(values.containsKey(num)) {
   			values.put(num, values.get(num) + 1);
   		} else {
   			values.put(num, 1);
   		}
   	}

   	List<Integer> result = new ArrayList<>();

   	for(int num : nums2) {
   		if(values.containsKey(num)) {
   			if(values.get(num) > 0) {
   				values.put(num, values.get(num) - 1);
   				result.add(num);
   			}
   		}
   	}
   	
   	int[] r = new int[result.size()];
   	for(int i=0; i<result.size(); i++) {
   		r[i] = result.get(i);
   	}
   	return r;
   	
   }
   
   public static void main(String[] args) {
   	
   	int[] r1 = new IntersectionOfTwoArraysII().intersect(
   			new int[] { 1, 2, 2, 1 }, new int[] { 2, 2 });   	
   	for(int r : r1) {
   		System.out.print(r + " ");
   	}
   	System.out.println();
   	
   	int[] r2 = new IntersectionOfTwoArraysII().intersect(
   			new int[] { 4, 9, 5 }, new int[] { 9, 4, 9, 8, 4 });
   	for(int r : r2) {
   		System.out.print(r + " ");
   	}
   	System.out.println();
   	
   	
   	
   	
   }
	
}
