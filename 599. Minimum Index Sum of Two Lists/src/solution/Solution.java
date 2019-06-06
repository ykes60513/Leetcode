package solution;

import java.util.*;

public class Solution {
	public String[] findRestaurant(String[] list1, String[] list2) {

		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < list1.length; i++) {
			map.put(list1[i], i);
		}

		List<String> result = new LinkedList<>();
		int index = Integer.MAX_VALUE;

		for (int i = 0; i < list2.length; i++) {

			if (map.containsKey(list2[i])) {

				if (map.get(list2[i]) + i < index) {

					result.clear();
					index = map.get(list2[i]) + i;
					result.add(list2[i]);
				} else if (map.get(list2[i]) + i == index) {
					result.add(list2[i]);
				}
			}
		}

		String[] output = new String[result.size()];
		for (int i = 0; i < result.size(); i++)
			output[i] = result.get(i);

		return output;
	}
}
