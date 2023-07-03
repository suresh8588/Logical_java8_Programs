package com.logical;

import java.util.Arrays;
import java.util.List;

public class MaxMinValue {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 2, 7, 8, 9);

		Integer max = list.stream().sorted().max(Integer::compare).get();
		System.out.println("Max Value : " + max);

		Integer min = list.stream().sorted().min(Integer::compare).get();
		System.out.println("Min Value : " + min);
	}
}
