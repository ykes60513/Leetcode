package solution;

import java.util.*;

import node.Node;

public class Solution1 {

	public Node copyRandomList(Node head) {

		if (head == null)
			return null;

		Node dummy = new Node(0);
		Node cur = dummy;

		Map<Node, Node> map = new HashMap<>();
		while (head != null) {

			if (!map.containsKey(head))
				map.put(head, new Node(head.val));

			cur.next = map.get(head);
			if (head.random != null) {

				if (!map.containsKey(head.random)) {
					map.put(head.random, new Node(head.random.val));
				}

				cur.next.random = map.get(head.random);
			}

			head = head.next;
			cur = cur.next;

		}

		return dummy.next;

	}

}
