/***
 * ArrayDeque-Solution
 */

package solution;

import java.util.*;

public class Solution3 {
	public int[] dailyTemperatures(int[] T) {

		Deque<Integer> stack = new ArrayDeque<>();
		int[] result = new int[T.length];

		for (int i = 0; i < T.length; i++) {
			while (!stack.isEmpty() && T[i] > T[stack.peek()]) {
				int temp = stack.pop();
				result[temp] = i - temp;
			}
			stack.push(i);

		}
		return result;
	}
}
