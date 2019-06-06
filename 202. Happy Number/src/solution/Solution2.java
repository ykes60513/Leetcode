package solution;

public class Solution2 {

	public boolean isHappy(int n) {

		int num = 0;
		while (n != 0) {

			num += Math.pow(n % 10, 2);
			n /= 10;
		}

		if (num == 4)
			return false;
		else if (num == 1)
			return true;
		else
			return isHappy(num);
	}
}
