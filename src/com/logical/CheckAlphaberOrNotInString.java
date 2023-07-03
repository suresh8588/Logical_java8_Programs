package com.logical;

public class CheckAlphaberOrNotInString {

	public static void main(String[] args) {

		// String str="suresh123";
		boolean checkAlphabet = checkAlphabet("suresh");
		System.out.println("String contains only alphabets : " + checkAlphabet);

	}

	public static boolean checkAlphabet(String str) {

		for (char c : str.toCharArray()) {
			if (!Character.isLetter(c)) {
				return false;
			}
		}
		return true;
	}
}
