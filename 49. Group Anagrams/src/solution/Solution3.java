package solution;

import java.util.*;

public class Solution3 {
	public List<List<String>> groupAnagrams(String[] strs) {

		Map<String, List<String>> map = new HashMap<>();
		for (String str : strs) {
			int[] count = new int[26];
			for (Character ch : str.toCharArray()) {
				count[ch - 'a']++;
			}
			StringBuilder sb = new StringBuilder();

			for (int i = 0; i < count.length; i++) {
				if (count[i] != 0) {
					sb.append(count[i]).append((char) (i + 'a'));
				}
			}
			String s = sb.toString();
			if (map.containsKey(s)) {

				List<String> list = map.get(s);
				list.add(str);

			} else {

				List<String> list = new ArrayList<>();
				list.add(str);
				map.put(s, list);
			}
		}
		return new ArrayList<>(map.values());
	}
}
