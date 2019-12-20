/******************************
 * Recursive approach
 */
package solution;

import java.util.*;

public class Solution2 {
	public String countAndSay(int n) {

		StringBuilder sb = new StringBuilder();

		for (int i : helper(n))
			sb.append(i);

		return sb.toString();

	}

	private List<Integer> helper(int n) {

		List<Integer> result = new ArrayList<>();

		if (n == 1) {
			result.add(1);
			return result;
		}

		List<Integer> pre = helper(n - 1);

		int num = pre.get(0);
		int count = 1;

		for (int i = 1; i < pre.size(); i++) {

			if (pre.get(i) == num)
				count++;
			else {

				result.add(count);
				result.add(num);
				num = pre.get(i);
				count = 1;

			}

		}

		result.add(count);
		result.add(num);

		return result;

	}
}
