package problems;

public class LongestPalindromicString {

	int maxLength = -1;
	int bestStart = -1;
	int bestEnd = -1;
	
	public String longestPalindrome(String s) {

		for(int i=0; i<s.length(); i++) {
			findPalindromes(s, i);
		}
		
		return s.substring(bestStart, bestEnd);
		
	}
	
	private void findPalindromes(String s, int index) {
		findPalindrome(s, index, index);
		findPalindrome(s, index, index+1);
	}
	
	private void findPalindrome(String s, int startIndex, int endIndex) {
		
		while(startIndex >= 0 && endIndex < s.length()) {
		
			char c1 = s.charAt(startIndex);
			char c2 = s.charAt(endIndex);
			if(c1 != c2) {
				break;
			} else {
				if(endIndex + 1 - startIndex > maxLength) {
					bestStart = startIndex;
					bestEnd = endIndex + 1;
					maxLength = bestEnd - bestStart;
				}
				startIndex--;
				endIndex++;
			}
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println(new LongestPalindromicString().longestPalindrome("X"));
	}

}
