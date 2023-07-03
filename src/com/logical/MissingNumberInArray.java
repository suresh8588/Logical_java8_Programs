package com.logical;

import java.util.HashSet;

public class MissingNumberInArray {

	public static void printMissingNum(Integer[] arr) {

		HashSet<Integer> set = new HashSet<>();
		for (Integer i : arr) {
			set.add(i);
		}
		System.out.println(set);

		for (int i = 0; i <= arr.length-1; i++) {
			if (!set.contains(i)) {
				System.out.println(i);
			}
		}

	}

	public static void main(String[] args) {
		Integer[] arr = { 1, 2, 4, 5, 2, 6, 9, 5, 8, 0 };
		printMissingNum(arr);
	}
}
