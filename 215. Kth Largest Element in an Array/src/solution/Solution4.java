package solution;

import java.util.PriorityQueue;

public class Solution4 {
	public int findKthLargest(int[] nums, int k) {

		PriorityQueue<Integer> queue = new PriorityQueue<>();

		for (int i : nums) {
			if (queue.size() == k) {
				if (i > queue.peek()) {
					queue.poll();
					queue.offer(i);
				}
			}else {
				queue.offer(i);
			}
		}

		return queue.poll();
	}
}
