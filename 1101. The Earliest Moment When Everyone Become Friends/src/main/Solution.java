package main;

import java.util.*;

class Solution {
	public int earliestAcq(int[][] logs, int n) {

		Arrays.sort(logs, (a,b) -> a[0] - b[0]);

		UnionFind uf = new UnionFind(n);

		for (int i = 0; i < logs.length; i++) {

			if (!uf.union(logs[i][1], logs[i][2]))
				return logs[i][0];
		}

		return -1;
	}

	class UnionFind {

		private int[] root;
		private int[] rank;
		private int group;

		public UnionFind(int size) {

			root = new int[size];
			rank = new int[size];
			group = size;

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

			if (rootX != rootY) {

				if (rank[rootX] > rank[rootY])
					root[rootY] = rootX;
				else if (rank[rootY] > rank[rootX])
					root[rootX] = rootY;
				else {
					root[rootY] = rootX;
					rank[rootX]++;
				}
				group--;
			}

			return group != 1;
		}
	}
}