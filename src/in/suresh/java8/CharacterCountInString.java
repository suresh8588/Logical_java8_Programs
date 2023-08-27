package in.suresh.java8;

import java.util.Map;
import java.util.stream.Collectors;

public class CharacterCountInString {

	public static void main(String[] args) {

		String str = "Java Articles arej Awesome";
		Map<Character, Long> map = str.chars().mapToObj(c -> (char) c).filter(c -> c != ' ')
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));

		map.forEach((k, v) -> System.out.println(k + " = " + v));
		
	}
}
