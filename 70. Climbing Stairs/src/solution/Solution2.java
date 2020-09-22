package solution;

public class Solution2 {
	public int climbStairs(int n) {

		if (n == 1) return 1;
		if (n == 2) return 2;

		int cur = 1;
		int prev = 2;

		while (n > 2) {
			int temp = prev;
			prev += cur;
			cur = temp;
			n--;
		}
		return prev;
	}
}
