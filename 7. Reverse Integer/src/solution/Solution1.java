package solution;

public class Solution1 {
	public int reverse(int x) {
		int ans = 0;
		while (x != 0) {
			int temp = ans * 10 + x % 10;
			if (temp / 10 != ans)
				return 0;
			ans = temp;
			x /= 10;
		}
		return ans;
	}
}
