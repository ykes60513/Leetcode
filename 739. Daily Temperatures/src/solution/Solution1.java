package solution;

import java.util.*;

public class Solution1 {
	public int[] dailyTemperatures(int[] T) {
		
		int[] ans = new int[T.length];
		Stack<Integer> stack = new Stack<>();
		
		for (int i = 0; i < T.length; i++) {
			while (!stack.isEmpty() && T[i] > T[stack.peek()]) {
				int temp = stack.pop();
				ans[temp] = i - temp;
				
			}
			stack.push(i);
		}
		return ans;
	}
}
