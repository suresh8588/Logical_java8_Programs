package com.logical;

import java.util.Scanner;

public class FibonacciSeries {

	public static void fibSeries(int n) {
		int a = 0, b = 1;
		System.out.print(a+" "+b);
		for (int i = 2; i <= n; i++) {
			int c = a + b;
			a = b;
			b = c;
			System.out.print(" "+c);
		}
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		fibSeries(n);
	}
}
