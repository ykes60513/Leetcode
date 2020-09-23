package main;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		// define original array
		int[] intArray = new int[] { 52, 45, 32, 64, 12, 87, 78, 98, 23, 7 };
		int temp = 0;

		// print original array
		System.out.println(Arrays.toString(intArray));

		Arrays.sort(intArray);
		System.out.println(Arrays.toString(intArray));

		reverse(intArray);

		// print sorted array
		System.out.println(Arrays.toString(intArray));

	}

	private static void reverse(int[] a) {

		int i = 0;
		int j = a.length - 1;

		while (i < j) {

			int temp = a[i];
			a[i++] = a[j];
			a[j--] = temp;
		}
	}
}
