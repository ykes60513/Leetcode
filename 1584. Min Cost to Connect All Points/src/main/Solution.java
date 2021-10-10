package main;

import java.util.Arrays;

public class Solution {

	class UnionFind {

		int[] root;
		int[] rank;
		int group;

		UnionFind(int size) {

			group = size;
			root = new int[size];
			rank = new int[size];

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

	public int minCostConnectPoints(int[][] points) {

		int size = (points.length * (points.length - 1)) / 2;

		UnionFind uf = new UnionFind(points.length);

		int[][] weight = new int[size][3];
		int index = 0;

		for (int i = 0; i < points.length; i++) {

			for (int j = i + 1; j < points.length; j++) {
				int cost = Math.abs(points[i][0] - points[j][0]) + Math.abs(points[i][1] - points[j][1]);

				weight[index++] = new int[] { cost, i, j };
			}
		}

		Arrays.sort(weight, (a, b) -> a[0] - b[0]);

		int ans = 0;
		int edges = 0;

		for (int[] edge : weight) {

			int p1 = edge[1];
			int p2 = edge[2];

			if (uf.find(p1) != uf.find(p2)) {
				uf.union(p1, p2);
				ans += edge[0];
				edges++;
			}

			if (uf.group == 1)
				break;
		}

		if (edges != points.length - 1)
			return -1;

		return ans;
	}
}