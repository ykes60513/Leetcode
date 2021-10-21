package main;

import java.util.*;

public class Solution {
	public List<Integer> getRow(int rowIndex) {

		List<Integer> ans = new ArrayList<>();

		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1));

		while (rowIndex != 0) {

			List<Integer> newLayer = new ArrayList<>();
			newLayer.add(1);
			for (int i = 0; i < list.size() - 1; i++) {
				newLayer.add(list.get(i) + list.get(i + 1));
			}
			newLayer.add(1);
			list = new ArrayList<>(newLayer);
			rowIndex--;

		}
		return list;

	}
}