/*****************************************
 * Sort intervals by its start
 * If curr.start <= last.end
 * 		merge intervals
 * else
 * 		insert a new intervals
 * 
 * Time Complexity = O(nlogn)
 * Space Complexity = O(n)
 * 
 */

package solution;

import java.util.*;

public class Solution {

	public int[][] merge(int[][] intervals) {

		Arrays.sort(intervals, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] < o2[0] ? -1 : o1[0] == o2[0] ? 0 : 1;
			}
		});

		LinkedList<int[]> result = new LinkedList<>();

		for (int[] t : intervals) {

			if (result.isEmpty() || result.getLast()[1] > t[0])
				result.add(t);
			else {
				result.getLast()[1] = Math.max(result.getLast()[1],t[1]);
			}

		}

		return result.toArray(new int[result.size()][]);

	}

}
