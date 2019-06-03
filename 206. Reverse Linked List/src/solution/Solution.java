package solution;

/*
 * Definition for singly-linked list.
*/
class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
class Solution {
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