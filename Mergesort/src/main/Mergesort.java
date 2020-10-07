package main;

public class Mergesort {

	public static void sort(int[] nums, int l, int r) {

		if (l < r) {

			int m = l + (r - l) / 2;
			sort(nums, l, m);
			sort(nums, m + 1, r);
			merge(nums, l, m, r);
		}

	}

	private static void merge(int[] nums, int l, int m, int r) {

		int n1 = m - l + 1;
		int n2 = r - m;

		int[] L = new int[n1];
		int[] R = new int[n2];

		for (int i = 0; i < n1; i++)
			L[i] = nums[l + i];
		for (int j = 0; j < n2; j++)
			R[j] = nums[m + j + 1];

		int i = 0, j = 0, k = l;

		while (i < n1 || j < n2) {

			nums[k++] = i < n1 ? (j < n2 ? (L[i] < R[j] ? L[i++] : R[j++]) : L[i++]) : R[j++];

		}

	}

}
