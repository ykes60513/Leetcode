package solution;

import main.ListNode;

class Solution1 {
	public ListNode reverseList(ListNode head) {

		if (head == null)
			return null;
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