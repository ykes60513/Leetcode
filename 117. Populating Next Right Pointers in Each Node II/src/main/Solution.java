package main;

import java.util.*;

public class Solution {
	public Node connect(Node root) {

		Queue<Node> queue = new LinkedList<>();
		List<Node> list = new ArrayList<>();

		if (root == null)
			return root;

		queue.offer(root);

		while (!queue.isEmpty()) {

			int size = queue.size();

			for (int i = 0; i < size; i++) {

				Node node = queue.poll();
				if (node.left != null)
					queue.offer(node.left);

				if (node.right != null)
					queue.offer(node.right);

				list.add(node);
			}

			for (int i = 0; i < list.size() - 1; i++) {

				list.get(i).next = list.get(i + 1);

			}

			list.clear();
		}

		return root;
	}
}
