package solution;

import java.util.*;

public class Solution {

	public List<String> subdomainVisits(String[] cpdomains) {

		Map<String, Integer> map = new HashMap<>();
		for (String str : cpdomains) {

			int i = str.indexOf(' ');
			int n = Integer.parseInt(str.substring(0, i));
			String s = str.substring(i + 1);

			while (true) {

				map.put(s, map.getOrDefault(s, 0) + n);

				int dotIndex = s.indexOf(".");
				if (dotIndex == -1)
					break;
				else
					s = s.substring(dotIndex + 1);

			}

		}

		List<String> res = new ArrayList<>();
		for (String d : map.keySet())
			res.add(map.get(d) + " " + d);
		return res;
	}
}
