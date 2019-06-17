package solution;

public class MinStack {
	
	private Node head;

	private class Node {

		int min;
		int val;
		Node next;

		private Node(int val, int min, Node next) {
			this.val = val;
			this.min = min;
			this.next = next;
		}
	}

	/** initialize your data structure here. */
	public MinStack() {

	}

	public void push(int x) {

		if (head == null) {
			head = new Node(x, x, null);
		} else {
			head = new Node(x, Math.min(head.min, x), head);
		}
	}

	public void pop() {
		head = head.next;
	}

	public int top() {
		return head.val;
	}

	public int getMin() {
		return head.min;
	}
}
