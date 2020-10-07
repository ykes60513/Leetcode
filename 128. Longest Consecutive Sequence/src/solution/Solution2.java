package solution;

import java.util.*;
import java.util.stream.Collectors;

public class Solution2 {

	public int longestConsecutive(int[] nums) {
		
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        int max = 0;
        while (!set.isEmpty()) {
            Integer seed = set.iterator().next();
            int count=0, left=seed-1, right=seed;
            while (set.remove(left--)) count++;
            while (set.remove(right++)) count++;
            max = Math.max(count, max);
        }
        return max;
    }
}
