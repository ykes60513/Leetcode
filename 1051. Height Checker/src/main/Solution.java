package main;

import java.util.*;

public class Solution {
	public int heightChecker(int[] heights) {

		int[] expected = Arrays.copyOf(heights, heights.length);
		Arrays.sort(expected);

		int ans = 0;

		for (int i = 0; i < heights.length; i++) {

			if (expected[i] != heights[i])
				ans++;
		}

		return ans;
	}
}