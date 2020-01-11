package com.adneom.app;

import java.util.Arrays;
import java.util.List;

import com.adneom.app.utility.ListUtility;

public class ShareLibraryApp {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 5, 6, 8, 7, 5, 4, 6, 7);
		System.out.println(ListUtility.partition(list, 4));
	}
}
