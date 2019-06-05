package solution;

class Node {
	public int val;
	public Node next;

	public Node(int _val) {
		val = _val;
	}

	public Node(int _val, Node _next) {
		val = _val;
		next = _next;
	}
}

class Solution {
	public Node insert(Node start, int x) {
		if (start == null) {
			Node cur = new Node(x);
			cur.next = cur;
			return cur;
		}
		Node cur = start.next;
		Node prev = start;
		boolean find = false;
		while (cur != start) {
			int next = cur.val;
			int pre = prev.val;
			if (x == pre || (x <= next && x > pre) || (next < pre && x > pre ) || (next < pre && x < next)) {
				find = true;
				Node node = new Node(x);
				prev.next = node;
				node.next = cur;
				break;
			}
			prev = cur;
			cur = cur.next;
		}
		if (!find) {
			Node node = new Node(x);
			prev.next = node;
			node.next = cur;
		}
		return start;
	}
}