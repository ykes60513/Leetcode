/***
 * Array to implement Stack
 */

package solution;

public class Solution2 {
	public int[] dailyTemperatures(int[] T) {

		int[] stack = new int[T.length];
		int top = -1;
		int[] result = new int[T.length];

		for (int i = 0; i < T.length; i++) {
			while (top > -1 && T[i] > T[stack[top]]) {
				int temp = stack[top--];
				result[temp] = i - temp;
			}
			stack[++top] = i;
		}

		return result;

	}
}
