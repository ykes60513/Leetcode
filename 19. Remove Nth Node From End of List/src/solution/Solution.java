package solution;

/* Definition for singly-linked list.
 */
class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

class Solution {
	public ListNode removeNthFromEnd(ListNode head, int n) {

		ListNode latter = head;
		ListNode former = head;

		for (int i = 0; i < n - 1; i++) {

			if (latter.next == null)
				return null;

			latter = latter.next;
		}
		if (latter.next == null) {
			return head.next;
		} // end of list, remove the first node

		latter = latter.next;

		while (latter.next != null) {

			latter = latter.next;
			former = former.next;

		}

		former.next = former.next.next;
		return head;

	}
}