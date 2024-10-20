package problems;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {

	public int lengthOfLongestSubstring(String s) {
		
		int start = 0;
		int maxLength = 0;
		
		HashMap<Character, Integer> chars = new HashMap<>();
		
		for(int i=0; i<s.length(); i++) {
			Character c = s.charAt(i);
			if(chars.containsKey(c) && chars.get(c) >= start) {
				start = chars.get(c) + 1;
			}
			chars.put(c, i);
			
			maxLength = Math.max(maxLength, i-start+1);
		}
		return maxLength;
		
		
	}
	
	public static void main(String[] args) {
		System.out.println(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("abba"));
	}
	

}
