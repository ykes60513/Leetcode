package solution;

import java.util.*;

public class Solution2 {
	
	public List<List<String>> groupAnagrams(String[] strs) {

		Map<List<Integer>, Integer> map = new HashMap<>();
		List<List<String>> result = new ArrayList<>();

		int count = 0;

		for (String s : strs) {

			List<Integer> li = convert(s);
			if (!map.containsKey(li)) {

				List<String> layer = new ArrayList<>();
				layer.add(s);
				result.add(layer);
				map.put(li, count++);
			} else {

				result.get(map.get(li)).add(s);

			}
		}

		return result;

	}

	public List<Integer> convert(String s) {

		int[] result = new int[128];
		Arrays.fill(result, 0);
		for (int i = 0; i < s.length(); i++)
			result[s.charAt(i)]++;

		List<Integer> output = new ArrayList<>();
		for (int i : result)
			output.add(i);
		
		return output;
	}

}
