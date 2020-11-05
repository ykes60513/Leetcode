package solution;

public class Solution {
	public boolean threeConsecutiveOdds(int[] arr) {

		int flag = 0;
		for (int i : arr) {

			if (i % 2 == 0)
				flag = 0;
			else if (flag != 2)
				flag++;
			else
				return true;
		}

		return false;
	}
}
