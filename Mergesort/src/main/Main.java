/**************************************************
 * MergeSort
 * Time Complexity : O(nlogn)
 */

package main;

public class Main {

	public static void main(String[] args) {

		int[] result = new int[] { 5, 2, 4, 6, 1, 3 };

		Mergesort.sort(result, 0, result.length - 1);

		for (int i : result)
			System.out.println(i);

	}

}
