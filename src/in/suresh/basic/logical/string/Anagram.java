package in.suresh.basic.logical.string;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1 = "listen";
		String s2 = "silenu";

		if (s1.length() != s2.length()) {
			System.out.println("Given String are not anagram ");
			return;

		}
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		boolean flag = Arrays.equals(ch1, ch2);
		if (flag) {
			System.out.println("Given String are anagram");

		} else {
			System.out.println("Given String are not anagram ");
		}

	}
}
