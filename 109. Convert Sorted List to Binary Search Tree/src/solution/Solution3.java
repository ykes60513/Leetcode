/*****************************
 * Binary Search solution
 */
package solution;

import main.*;

public class Solution3 {

	private ListNode head;

	public TreeNode sortedListToBST(ListNode head) {

		int size = findSize(head);

		this.head = head;

		return covertListToBST(0, size - 1);
	}

	private TreeNode covertListToBST(int left, int right) {

		if (left > right) {
			return null;
		}

		int mid = left + (right - left) / 2;

		TreeNode leftNode = covertListToBST(left, mid - 1);

		TreeNode node = new TreeNode(this.head.val);
		node.left = leftNode;

		this.head = this.head.next;

		TreeNode rightNode = covertListToBST(mid + 1, right);
		node.right = rightNode;

		return node;

	}

	private int findSize(ListNode head) {

		int size = 0;

		while (head != null) {
			head = head.next;
			size++;
		}

		return size;
	}
}
