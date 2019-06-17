/***
 * BFS-solution
 */
package solution;

import java.util.*;

import node.Node;

public class Solution2 {
	public Node cloneGraph(Node node) {
		
		if (node == null)
			return null;

		Map<Node, Node> map = new HashMap<>(); // origin node : copied node
		Node duplicate = new Node(node.val, new ArrayList<Node>()); // copy

		map.put(node, duplicate);

		Queue<Node> queue = new ArrayDeque<>(); // origin nodes
		queue.add(node);

		// BFS traverse graph
		while (!queue.isEmpty()) {
			Node cur = queue.poll();
			for (Node neighbor : cur.neighbors) {
				if (!map.containsKey(neighbor)) {
					map.put(neighbor, new Node(neighbor.val, new ArrayList<Node>()));
					
					queue.offer(neighbor);
				}
				// add neighbors to the copied node
				// copied node: map.get(cur) -> copied node of cur
				// neighbors: map.get(neighbor) -> copied node of neighbor
				map.get(cur).neighbors.add(map.get(neighbor));
			}
		}
		return duplicate;
	}
}
