package in.suresh.temp;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurance {

	public static void main(String[] args) {
		// input : "abbc";
		// output : a=1, b=2,c=1

		String str = "abbbcdde";
		Map<Character, Integer> map = new HashMap<>();

		char[] charArray = str.toCharArray();
		for (char c : charArray) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
	}
}
