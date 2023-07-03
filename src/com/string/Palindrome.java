package com.string;

public class Palindrome {

	public static void main(String[] args) {
		String s = "amma";
		String revStr = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			revStr = revStr + s.charAt(i);
		}

		if (s.equals(revStr)) {
			System.out.println("Given String is Palindrome");
		} else {
			System.out.println("Given String is not a Palindrome");
		}
	}
}
