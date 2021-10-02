package main;

import java.util.*;

public class Solution {
	public List<List<Integer>> levelOrder(Node root) {

		List<List<Integer>> result = new ArrayList<>();
		Queue<Node> queue = new LinkedList<>();

		if (root == null)
			return result;

		queue.offer(root);

		while (!queue.isEmpty()) {

			int size = queue.size();
			List<Integer> list = new ArrayList<>();

			for (int i = 0; i < size; i++) {

				Node node = queue.poll();
				list.add(node.val);
				for (Node children : node.children)
					queue.offer(children);

			}

			result.add(list);
		}

		return result;
	}
}
