package problems;

public class AddTwoNumbers {

	static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		ListNode firstDigit = new ListNode();
		ListNode thisDigit = null;
		
		int carry = 0;
		
		while(carry != 0 || l1 != null || l2 != null) {
			
			if(thisDigit == null) {
				thisDigit = firstDigit;
			} else {
				thisDigit.next = new ListNode();
				thisDigit = thisDigit.next;
			}
			
			int sum = carry + (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0);
			
			thisDigit.val = sum % 10;
			
			carry = sum / 10;
			
			if(l1 != null) {
				l1 = l1.next;
			}
			if(l2 != null) {
				l2 = l2.next;
			}
			
		}
		return firstDigit;
		
	}
}
