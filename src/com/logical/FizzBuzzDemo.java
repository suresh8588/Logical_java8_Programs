package com.logical;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzzDemo {
	public List<String> fizzBuzz(int n) {
		List<String> list = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				list.add("FizzBuzz");
			} else if (i % 3 == 0) {
				list.add("Fizz");
			} else if (i % 5 == 0) {
				list.add("Buzz");
			} else
				list.add(Integer.toString(i));
		}
		return list;
	}

	public static void main(String[] args) {
		FizzBuzzDemo obj = new FizzBuzzDemo();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int n = sc.nextInt();
		List<String> list = new ArrayList<>();
		list = obj.fizzBuzz(n);
		System.out.println(list);
	}
}
