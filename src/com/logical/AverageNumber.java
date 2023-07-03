package com.logical;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageNumber {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(4, 5, 20, 7, 10, 9);
		OptionalDouble average = list.stream().mapToInt(i -> i * i).average();
		System.out.println(average);
	}

}
