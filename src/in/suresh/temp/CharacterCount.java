package in.suresh.temp;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {

	public static void main(String[] args) {
		String s = "abcdabcde";
		HashMap<Character, Integer> map = new HashMap<>();
		char[] array = s.toCharArray();

		for (char c : array) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {

			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}
}
