package com.logical;

import java.util.Scanner;

public class StringReverse {

	public static String revString(String str) {
		String revString = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			revString = revString + str.charAt(i);
		}
		return revString;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String value");
		String str = sc.next();
		String string = revString(str);
		System.out.println(string);
	}
}
