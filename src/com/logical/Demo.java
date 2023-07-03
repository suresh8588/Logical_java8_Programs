package com.logical;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };

		int sum = Arrays.stream(arr).reduce(0, (a,b)-> a+b);
		System.out.println(sum);
	}

}
