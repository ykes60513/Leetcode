/****************************************************
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit. 
 * Add the two numbers and return it as a linked list.
 * 
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */
package solution;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		int num = 0;
		int carry = 0;

		ListNode dummy = new ListNode(0);
		ListNode cur = dummy;

		while (l1 != null || l2 != null) {

			num = carry;

			if (l1 != null)
				num += l1.val;
			if (l2 != null)
				num += l2.val;

			cur.next = new ListNode(num % 10);

			carry = num / 10;

			cur = cur.next;

			if (l1 != null)
				l1 = l1.next;

			if (l2 != null)
				l2 = l2.next;

		}
		if (carry != 0)
			cur.next = new ListNode(carry);

		return dummy.next;

	}
}