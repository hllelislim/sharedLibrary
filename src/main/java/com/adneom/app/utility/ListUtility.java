package com.adneom.app.utility;

import java.util.ArrayList;
import java.util.List;

public class ListUtility {

	public static List<List<Integer>> partition(List<Integer> initialList, Integer size) {
		List<List<Integer>> subLists = new ArrayList<>();
		while (size > 0 && initialList.size() >= size) {
			subLists.add(initialList.subList(0, size));
			initialList = initialList.subList(size, initialList.size());
		}
		if (!initialList.isEmpty() && size > 0) {
			subLists.add(initialList);
		}
		return subLists;
	}

}
