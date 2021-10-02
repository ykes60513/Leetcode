package main;

import java.util.*;

public class Solution3 {
	public int maxDepth(Node root) {

		if (root == null)
			return 0;

		int res = 0;

		Queue<Node> queue = new LinkedList<>();
		queue.offer(root);

		while (!queue.isEmpty()) {

			int size = queue.size();
			res++;

			for (int i = 0; i < size; i++) {

				Node node = queue.poll();
				for (Node children : node.children)
					queue.offer(children);
			}
		}

		return res;

	}
}
