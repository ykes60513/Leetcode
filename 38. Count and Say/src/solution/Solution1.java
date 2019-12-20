/*******************************
 * Iterative approach
 */

package solution;

import java.util.*;

public class Solution1 {
	public String countAndSay(int n) {

		List<Integer> result = new ArrayList<>();
		result.add(1);
		for (int i = 1; i < n; i++) {
			result = helper(result);
		}

		StringBuilder sb = new StringBuilder();
		for (int i : result)
			sb.append(i);

		return sb.toString();

	}

	private List<Integer> helper(List<Integer> t) {

		List<Integer> result = new ArrayList<>();

		int count = 1;
		int num = t.get(0);

		for (int i = 1; i < t.size(); i++) {

			if (t.get(i) == num) {
				count++;
			} else {

				result.add(count);
				result.add(num);
				num = t.get(i);
				count = 1;
			}

		}

		result.add(count);
		result.add(num);

		return result;

	}
}
