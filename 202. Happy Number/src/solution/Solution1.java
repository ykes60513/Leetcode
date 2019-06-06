package solution;

import java.util.*;

public class Solution1 {
	public boolean isHappy(int n) {

		Set<Integer> happy = new HashSet<>();
		while (!happy.contains(n)) {

			happy.add(n);

			if (happy(n) != 1)
				n = happy(n);
			else
				return true;
		}

		return false;

	}

	private int happy(int n) {

		int num = 0;
		while (n != 0) {
			num += Math.pow(n % 10, 2);
			n /= 10;
		}
		return num;
	}
}
