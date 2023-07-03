package com.logical;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Concat2Lists {
	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);
		List<Integer> list2 = Arrays.asList(4, 5, 3, 6, 7, 8);

		//// print elements in finalList
		Stream<Integer> fullList = Stream.concat(list1.stream(), list2.stream());
		List<Integer> finalList = fullList.collect(Collectors.toList());
		System.out.println(finalList);

		// Only print unique elements in finalList1
		Stream<Integer> set = Stream.concat(list1.stream(), list2.stream());
		Set<Integer> finalList1 = set.collect(Collectors.toSet());
		System.out.println(finalList1);

		Integer max = finalList1.stream().sorted().max(Integer::compare).get();
		System.out.println("Max Value : " + max);

		Integer min = finalList1.stream().sorted().min(Integer::compare).get();
		System.out.println("Min Value : " + min);

	}

}
