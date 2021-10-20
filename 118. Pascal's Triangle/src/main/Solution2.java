package main;

import java.util.*;

public class Solution2 {
	public List<List<Integer>> generate(int numRows) {

		List<List<Integer>> result = new ArrayList<>();

		for (int i = 0; i < numRows; i++) {

			List<Integer> temp = new ArrayList<>();

			for (int j = 0; j < i; j++) {

				List<Integer> pre = result.get(i - 1);
				temp.add(pre.get(j) + ((j >= 1) ? pre.get(j - 1) : 0));

			}

			temp.add(1);
			result.add(temp);

		}

		return result;

	}
}