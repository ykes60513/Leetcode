package main;

import java.util.*;

public class Solution {
	public List<List<Integer>> generate(int numRows) {

		List<List<Integer>> ans = new ArrayList<>();
		ans.add(new ArrayList<Integer>(Arrays.asList(1)));

		for (int i = 0; i < numRows - 1; i++) {

			List<Integer> nextList = new ArrayList<>();
			List<Integer> list = ans.get(i);
			nextList.add(1);
			for (int j = 0; j < list.size() - 1; j++) {
				nextList.add(list.get(j) + list.get(j + 1));
			}

			nextList.add(1);
			ans.add(nextList);

		}
		return ans;

	}
}