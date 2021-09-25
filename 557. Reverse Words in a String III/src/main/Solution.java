package main;

import java.util.*;

public class Solution {
	public String reverseWords(String s) {

		if (s == null || s.length() == 0)
			return "";

		String[] sarray = s.split(" ");
		List<String> list = new ArrayList<>();

		for (String sa : sarray) {

			list.add(reverse(sa));

		}

		StringBuilder sb = new StringBuilder();
		for (String sa : list) {

			sb.append(sa).append(" ");
		}

		return sb.substring(0, sb.length() - 1).toString();
	}

	private String reverse(String s) {

		StringBuilder sb = new StringBuilder();

		for (char c : s.toCharArray())
			sb.append(c);

		return sb.reverse().toString();
	}
}
