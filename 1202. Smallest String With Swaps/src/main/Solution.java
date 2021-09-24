package main;

import java.util.*;

class Solution {

	class UnionFind {

		private int[] root;

		public UnionFind(int size) {

			root = new int[size];

			for (int i = 0; i < size; i++) {

				root[i] = i;
			}
		}
		
		private int find(int x) {
			
			if( x == root[x])
				return x;
			
			return root[x] = find(root[x]);			
		}
		
		private void union(int x, int y) {
			int rootX = find(x);
			int rootY = find(y);
			if (rootX < rootY) {
				root[rootY] = rootX;
			} else {
				root[rootX] = rootY;
			}
		}
	}

	public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {

		if (s == null || s.length() == 0) {
			return null;
		}

		UnionFind uf = new UnionFind(s.length());

		for (List<Integer> pair : pairs) {
			uf.union(pair.get(0), pair.get(1));
		}

		Map<Integer, PriorityQueue<Character>> map = new HashMap<>();
		
		char[] sChar = s.toCharArray();
		for (int i = 0; i < sChar.length; i++) {
			int root = uf.find(i);
			map.putIfAbsent(root, new PriorityQueue<>());
			map.get(root).offer(sChar[i]);
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < sChar.length; i++) {
			sb.append(map.get(uf.find(i)).poll());
		}
		return sb.toString();
	}

	
}