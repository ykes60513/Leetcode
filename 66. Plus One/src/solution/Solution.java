package solution;

import java.util.LinkedList;

public class Solution {
	public int[] plusOne(int[] digits) {

		LinkedList<Integer> list = new LinkedList<>();

		int a, b;

		int t = digits[digits.length - 1] + 1;

		b = t % 10;
		a = t / 10;

		for (int i = digits.length - 2; i >= 0; i--) {

			list.addFirst(b);
			t = digits[i] + a;
			b = t % 10;
			a = t / 10;

		}
		list.addFirst(b);
		if (a != 0)
			list.addFirst(a);

		int[] result = new int[list.size()];
		for (int i = 0; i < list.size(); i++)
			result[i] = list.get(i);

		return result;

	}
}
