/***********************************
 * Merge Sort (Top-Down)
 * 
 * Time Complexity : O(nlogn)
 * Space Complexity : O(logn)
 */

package solution;

public class Solution1 {
	public ListNode sortList(ListNode head) {

		if (head == null || head.next == null)
			return head;

		ListNode slow = head;
		ListNode fast = head.next;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}

		ListNode mid = slow.next;
		slow.next = null;
		return merge(sortList(head), sortList(mid));

	}

	private ListNode merge(ListNode l1, ListNode l2) {

		ListNode dummy = new ListNode(0);
		ListNode cur = dummy;

		while (l1 != null && l2 != null) {
			if (l1.val > l2.val) {
				ListNode temp = l1;
				l1 = l2;
				l2 = temp;
			}

			cur.next = l1;
			l1 = l1.next;
			cur = cur.next;
		}

		if (l1 != null)
			cur.next = l1;
		if (l2 != null)
			cur.next = l2;

		return dummy.next;
	}
}
