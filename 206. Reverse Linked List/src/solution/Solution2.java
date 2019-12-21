/**********************************
 * Recursive solution
 */
package solution;

import main.ListNode;

public class Solution2 {
	public ListNode reverseList(ListNode head) {
		return reverseListInt(head, null);
	}

	private ListNode reverseListInt(ListNode head, ListNode newHead) {
		if (head == null)
			return newHead;
		ListNode next = head.next;
		head.next = newHead;
		return reverseListInt(next, head);
	}
}
