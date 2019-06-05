package solution;

import listnode.ListNode;

public class Solution {
	public ListNode rotateRight(ListNode head, int k) {

		if (head == null)
			return head;

		ListNode slow = head;
		ListNode fast = head;

		int count = 0;

		while (fast != null) {
			count++;
			fast = fast.next;
		}

		k %= count;

		fast = head;

		while (k > 0) {

			fast = fast.next;
			k--;
		}

		while (fast.next != null) {
			fast = fast.next;
			slow = slow.next;
		}
		fast.next = head;
		head = slow.next;
		slow.next = null;

		return head;
	}

}
