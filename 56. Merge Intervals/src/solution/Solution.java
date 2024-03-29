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

		Arrays.sort(intervals, (o1, o2) -> o1[0] - o2[0]);

		LinkedList<int[]> result = new LinkedList<>();

		for (int[] i : intervals) {

			if (result.isEmpty() || result.getLast()[1] < i[0])
				result.add(i);
			else {
				result.getLast()[1] = Math.max(result.getLast()[1],i[1]);
			}

		}

		return result.toArray(new int[result.size()][]);

	}

}
