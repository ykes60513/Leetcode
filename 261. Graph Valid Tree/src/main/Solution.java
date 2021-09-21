package main;

public class Solution {
	public boolean validTree(int n, int[][] edges) {

		// Condition 1: The graph must contain n - 1 edges.
		if (edges.length != n - 1)
			return false;
		
		// Condition 2: The graph must contain a single connected component.
		UnionFind uf = new UnionFind(n);

		for (int i = 0; i < edges.length; i++) {
			if (!uf.union(edges[i][0], edges[i][1]))
				return false;
		}

		return true;
	}

	class UnionFind {

		private int[] root;
		private int[] rank;

		public UnionFind(int size) {

			root = new int[size];
			rank = new int[size];

			for (int i = 0; i < size; i++) {
				root[i] = i;
				rank[i] = 1;
			}
		}

		private int find(int x) {

			if (x == root[x])
				return x;

			return root[x] = find(root[x]);

		}

		private boolean union(int x, int y) {

			int rootX = find(x);
			int rootY = find(y);

			if (rootX == rootY)
				return false;

			if (rank[rootX] > rank[rootY])
				root[rootY] = rootX;
			else if (rank[rootY] > rank[rootX])
				root[rootX] = rootY;
			else {
				root[rootY] = rootX;
				rank[rootX]++;
			}

			return true;
		}

	}

}
