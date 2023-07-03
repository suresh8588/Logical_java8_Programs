package com.logical;

public class CheckNumberIsOrNot {

	public static void main(String[] args) {

		String str = "1234a";
		boolean checkNumber = checkNumber(str);
		System.out.println("String contains only numbers : " + checkNumber);
	}

	private static boolean checkNumber(String str) {

		for (char c : str.toCharArray()) {

			if (!Character.isDigit(c)) {
				return false;
			}
		}
		return true;

	}
}
