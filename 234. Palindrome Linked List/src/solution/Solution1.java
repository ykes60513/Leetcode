package solution;

import main.ListNode;

class Solution1 {
	public boolean isPalindrome(ListNode head) {

		ListNode slow = head;
		ListNode fast = head;
		while (fast != null && fast.next != null) {

			fast = fast.next.next;
			slow = slow.next;

		}
		if (fast != null) // list has odd elements
			slow = slow.next;

		slow = reverse(slow);
		while (slow != null) {

			if (slow.val != head.val)
				return false;

			slow = slow.next;
			head = head.next;
		}
		return true;

	}

	private ListNode reverse(ListNode head) {


		ListNode newHead = null;
		while (head != null) {

			ListNode next = head.next;
			head.next = newHead;
			newHead = head;
			head = next;
			
		}

		return newHead;

	}
}