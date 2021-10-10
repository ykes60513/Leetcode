package main;

import java.util.Arrays;

public class Solution {

	class UnionFind {

		int[] root;
		int[] rank;
		int group;
		int edges = 0;

		UnionFind(int size) {

			root = new int[size];
			rank = new int[size];
			group = size;

			for (int i = 0; i < size; i++) {
				root[i] = i;
				rank[i] = 1;
			}
		}

		private int find(int x) {

			if (x != root[x])
				root[x] = find(root[x]);

			return root[x];
		}

		private void union(int x, int y) {

			int rootX = find(x);
			int rootY = find(y);

			if (rootX != rootY) {

				group--;
				edges++;

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

	public int minimumCost(int n, int[][] connections) {

		UnionFind uf = new UnionFind(n);
		int weight = 0;

		Arrays.sort(connections, (a, b) -> a[2] - b[2]);

		for (int[] pair : connections) {

			int node1 = pair[0] - 1;
			int node2 = pair[1] - 1;

			if (uf.find(node1) != uf.find(node2)) {
				uf.union(node1, node2);
				weight += pair[2];
			}

			if (uf.group == 1)
				break;
		}

		if (uf.edges != n - 1)
			return -1;

		return weight;

	}
}