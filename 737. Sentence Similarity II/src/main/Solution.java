package main;

import java.util.*;

public class Solution {

	class UnionFind {

		Map<String, String> root = new HashMap<>();
		Map<String, Integer> rank = new HashMap<>();

		UnionFind(String[] s1, String[] s2) {

			for (int i = 0; i < s1.length; i++) {

				root.putIfAbsent(s1[i], s1[i]);
				root.putIfAbsent(s2[i], s2[i]);
				rank.putIfAbsent(s1[i], 1);
				rank.putIfAbsent(s2[i], 1);
			}
		}

		private String find(String s) {
			if (!s.equals(root.get(s)))
				root.put(s, find(root.get(s)));
			return root.get(s);
		}

		private void union(String x, String y) {

			String rootX = find(x);
			String rootY = find(y);

			if (!rootX.equals(rootY)) {
				if (rank.get(rootX) > rank.get(rootY))
					root.put(rootY, rootX);
				else if (rank.get(rootY) > rank.get(rootX))
					root.put(rootX, rootY);
				else {
					root.put(rootY, rootX);
					rank.put(rootX, rank.get(rootX) + 1);
				}
			}
		}
	}

	public boolean areSentencesSimilarTwo(String[] sentence1, String[] sentence2, List<List<String>> similarPairs) {

		if (sentence1.length != sentence2.length)
			return false;

		UnionFind uf = new UnionFind(sentence1, sentence2);

		for (List<String> pair : similarPairs) {

			if (!uf.root.containsKey(pair.get(0))) {

				uf.root.put(pair.get(0), pair.get(0));
				uf.rank.put(pair.get(0), 1);
			}

			if (!uf.root.containsKey(pair.get(1))) {
				uf.root.put(pair.get(1), pair.get(1));
				uf.rank.put(pair.get(1), 1);
			}

			uf.union(pair.get(0), pair.get(1));
		}

		for (int i = 0; i < sentence1.length; i++) {

			if (sentence1[i].equals(sentence2[i]))
				continue;

			String s1 = uf.find(sentence1[i]);
			String s2 = uf.find(sentence2[i]);
			if (!s1.equals(s2))
				return false;

		}

		return true;
	}
}