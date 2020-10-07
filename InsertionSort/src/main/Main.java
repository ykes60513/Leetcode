/*****************************************
 * InsertionSort
 * Time Complexity: O(n^2)
 */

package main;

public class Main {

	public static void main(String[] args) {

		int[] test = new int[] { 5, 2, 4, 6, 1, 3 };
		InsertionSort.sort(test);

		for (int i : test)
			System.out.println(i);

	}

}
