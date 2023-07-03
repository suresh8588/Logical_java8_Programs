package com.logical;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareNumber {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3, 4, 5, 20, 7, 10, 9);

		// Approach - 1
		List<Integer> squareValue = list.stream().map(i -> i * i).collect(Collectors.toList());
		System.out.println(squareValue);

		// Approach-2
		list.stream().mapToInt(i -> i * i).forEach(System.out::println);

		System.out.println();
		// Approach - 3

		list.stream().map(i -> i * i).forEach(System.out::println);

		// Approach - 4 Only even squares
		List<Integer> evenSquareValue = list.stream().filter(i -> i % 2 == 0).map(i -> i * i)
				.collect(Collectors.toList());
		System.out.println("Even Square values :" + evenSquareValue);
	}
}
