package solution;

import java.util.*;

public class Solution1 {
	public int[] intersect(int[] nums1, int[] nums2) {

		Map<Integer, Integer> map1 = new HashMap<>();
		Map<Integer, Integer> map2 = new HashMap<>();

		for (int i = 0; i < nums1.length; i++) {

			map1.put(nums1[i], map1.getOrDefault(nums1[i], 0) + 1);

		}

		Set<Integer> set = map1.keySet();

		for (int i = 0; i < nums2.length; i++) {

			if (set.contains(nums2[i])) {

				map2.put(nums2[i], map2.getOrDefault(nums2[i], 0) + 1);

			}

		}

		List<Integer> array = new ArrayList<>();

		int key = 0;
		int count = 0;

		for (Map.Entry<Integer, Integer> entry : map2.entrySet()) {

			key = entry.getKey();
			count = Math.min(map1.get(key), map2.get(key));

			for (int i = 0; i < count; i++)
				array.add(key);

		}

		int[] result = new int[array.size()];
		for (int i = 0; i < array.size(); i++)
			result[i] = array.get(i);

		return result;

	}
}
