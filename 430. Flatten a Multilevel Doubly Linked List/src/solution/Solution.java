package solution;

import java.util.*;

class Node {
	public int val;
	public Node prev;
	public Node next;
	public Node child;

	public Node() {
	}

	public Node(int _val, Node _prev, Node _next, Node _child) {
		val = _val;
		prev = _prev;
		next = _next;
		child = _child;
	}
};

class Solution {
	public Node flatten(Node head) {

		Node cur = head;

		Stack<Node> stack = new Stack<>();

		while (cur != null) {

			if (cur.child != null) {

				if (cur.next != null)
					stack.push(cur.next);

				cur.next = cur.child;
				cur.next.prev = cur;
				cur.child = null;

			} else if (cur.next == null && !stack.isEmpty()) {
				cur.next = stack.pop();
				cur.next.prev = cur;
			}

			cur = cur.next;

		}

		return head;

	}
}