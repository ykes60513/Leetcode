package main;

class Solution {
	public boolean validPath(int n, int[][] edges, int start, int end) {

		UnionFind uf = new UnionFind(n);
		for (int i = 0; i < edges.length; i++) {
			uf.union(edges[i][0], edges[i][1]);
		}

		return uf.find(start) == uf.find(end);
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

		private void union(int x, int y) {

			int rootX = find(x);
			int rootY = find(y);

			if (rootX != rootY) {
				if (rank[rootX] > rank[rootY])
					root[rootY] = rootX;
				else if (rank[rootY] > rank[rootX])
					root[rootX] = rootY;
				else {
					root[rootY] = rootX;
					rank[rootX]++;
				}
			}
		}
	}
}