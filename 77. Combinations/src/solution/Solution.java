package solution;

import java.util.*;

public class Solution {
	public List<List<Integer>> combine(int n, int k) {

		List<List<Integer>> result = new ArrayList<>();
		helper(result, new ArrayList<>(), n, k, 1);

		return result;
	}

	private void helper(List<List<Integer>> result, List<Integer> list, int n, int k, int start) {

		if (k==0) {
			result.add(new ArrayList<>(list));
			return;
		}
		for (int i = start; i <= n; i++) {
			list.add(i);
			helper(result, list, n, k-1, i + 1);
			list.remove(list.size() - 1);
		}

	}
}
