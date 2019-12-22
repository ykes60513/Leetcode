/************************************
 * Recursive solution
 */
package solution;

import main.*;

public class Solution2 {

	private ListNode findMiddleElement(ListNode head) {

		// The pointer used to disconnect the left half from the mid node.
		ListNode pre = null;
		ListNode slow = head;
		ListNode fast = head;

		while (fast != null && fast.next != null) {
			pre = slow;
			slow = slow.next;
			fast = fast.next.next;
		}

		if (pre != null) {
			pre.next = null;
		}

		return slow;
	}

	public TreeNode sortedListToBST(ListNode head) {

		// If the head doesn't exist, then the linked list is empty
		if (head == null) {
			return null;
		}

		// Find the middle element for the list.
		ListNode mid = this.findMiddleElement(head);

		// The mid becomes the root of the BST.
		TreeNode node = new TreeNode(mid.val);

		// Base case when there is just one element in the linked list
		if (head == mid) {
			return node;
		}

		// Recursively form balanced BSTs using the left and right halves of the
		// original list.
		node.left = this.sortedListToBST(head);
		node.right = this.sortedListToBST(mid.next);
		return node;
	}
}
