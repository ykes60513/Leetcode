/**
 * DFS-solution
 */

package solution;

import java.util.*;
import node.Node;

public class Solution1 {

	private Map<Node, Node> map = new HashMap<>();

	public Node cloneGraph(Node node) {

		return helper(node);
	}
	
	private Node helper(Node node) {
		
		if(node==null)
			return null;
		if(map.containsKey(node)) return map.get(node);
		Node dup = new Node(node.val, new ArrayList<Node>());
		map.put(node, dup);  // clone node and store as a node-duplicate pair
		for(Node neighbor : node.neighbors) {
			Node clone = helper(neighbor);
			dup.neighbors.add(clone);
		}
		return dup;	
	}
}
