package solution;

import java.util.LinkedList;

public class Solution {
	public int[] plusOne(int[] digits) {

		LinkedList<Integer> list = new LinkedList<>();

		int t = digits[digits.length - 1] + 1;

		int num = t % 10;
		int carry = t / 10;
		list.addFirst(num);

		for (int i = digits.length - 2; i >= 0; i--) {

			t = digits[i] + carry;
			num = t % 10;
			carry = t / 10;
			list.addFirst(num);

		}
		
		if (carry != 0)
			list.addFirst(carry);

		int[] result = new int[list.size()];
		for (int i = 0; i < list.size(); i++)
			result[i] = list.get(i);

		return result;

	}
}
