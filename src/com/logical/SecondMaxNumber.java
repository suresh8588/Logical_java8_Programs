package com.logical;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SecondMaxNumber {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 2, 7, 8, 9);

		Integer max = list.stream().sorted().max(Integer::compare).get();
		Optional<Integer> secondMax = list.stream().sorted().filter(i -> i != max).max(Integer::compare);
		System.out.println("Second Max Value : " + secondMax);
	}
}
