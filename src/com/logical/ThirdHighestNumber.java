package com.logical;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ThirdHighestNumber {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 2, 7, 8, 9);
		Optional<Integer> thirdHigestNumber = list.stream().sorted(Comparator.reverseOrder()).skip(2).findFirst();
		System.out.println(thirdHigestNumber);
	}
}
