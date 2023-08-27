package in.suresh.temp;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {

	public static void main(String[] args) {
		String s = "abcdabcde";
		HashMap<Character, Integer> charcter = new HashMap<>();
		char[] array = s.toCharArray();

		for (char c : array) {
			charcter.put(c, charcter.getOrDefault(c, 0) + 1);
		}

		for (Map.Entry<Character, Integer> map : charcter.entrySet()) {

			System.out.println(map.getKey() + " = " + map.getValue());
		}
	}
}
