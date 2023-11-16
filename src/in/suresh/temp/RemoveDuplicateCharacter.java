package in.suresh.temp;

import java.util.HashSet;

public class RemoveDuplicateCharacter {
	public static void main(String[] args) {

		String str = "java";

		String remDupCharacters = removeDuplicates(str);
		System.out.println(remDupCharacters);
	}

	private static String removeDuplicates(String str) {

		HashSet<Character> set = new HashSet<>();
		StringBuffer sb = new StringBuffer();
		char[] charArray = str.toCharArray();
		for (char c : charArray) {
			if (!set.contains(c)) {
				set.add(c);
				sb.append(c);
			}
		}
		return sb.toString();
	}
}
