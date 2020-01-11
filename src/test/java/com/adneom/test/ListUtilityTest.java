package com.adneom.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.adneom.app.utility.ListUtility;

public class ListUtilityTest {
	private List<Integer> emptyList;
	private List<Integer> initialList;
	private List<List<Integer>> finalList;
	private int size;

	@Before
	public void setup() {
		emptyList = Arrays.asList();
		initialList = Arrays.asList(1, 5, 8, 7, 9);
		finalList = Arrays.asList(Arrays.asList(1, 5), Arrays.asList(8, 7), Arrays.asList(9));
		size = 2;
	}

	@Test
	public void testing_partition_with_empty_list() {
		assertEquals(emptyList, ListUtility.partition(emptyList, size));
	}

	@Test
	public void testing_patition_with_size_zero() {
		assertEquals(emptyList, ListUtility.partition(initialList, 0));
	}

	@Test
	public void testing_partition_with_empty_list_and_size_zero() {
		assertEquals(emptyList, ListUtility.partition(emptyList, 0));
	}

	@Test
	public void testing_partition_with_initial_list_and_with_size_greater_than_zero() {
		assertEquals(finalList, ListUtility.partition(initialList, 2));
	}

	@Test
	public void testing_partition_with_initial_list_and_with_size_greater_than_initial_list_size() {
		assertEquals(Arrays.asList(initialList), ListUtility.partition(initialList, 10));
	}

}
