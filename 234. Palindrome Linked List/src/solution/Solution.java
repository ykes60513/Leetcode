package solution;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

class Solution {
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

		if (head == null)
			return head;

		ListNode ptr = head;
		while (ptr.next != null) {

			ListNode next = ptr.next.next;
			ptr.next.next = head;
			head = ptr.next;
			ptr.next = next;
		}

		return head;

	}
}