package solution;

public class Solution2 {
	public int climbStairs(int n) {

		if (n == 1) return 1;
		if (n == 2) return 2;

		int pre = 1;
		int cur = 2;

		while (n > 2) {
			int temp = cur;
			cur += pre;
			pre = temp;
			n--;
		}
		return cur;
	}
}
