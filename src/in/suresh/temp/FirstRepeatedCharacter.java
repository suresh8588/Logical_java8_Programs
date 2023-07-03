package in.suresh.temp;

import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatedCharacter {

	public static void main(String[] args) {
		String input = "java Hungry Blog Alive is Awesome";

		Set<Entry<Character, Long>> entrySet = input.chars().mapToObj(s -> (Character.valueOf((char) s)))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet();

		Character character = entrySet.stream().filter(entry -> entry.getValue() > 1L).map(entry -> entry.getKey())
				.findFirst().get();

		System.out.println(character);
	}
}
