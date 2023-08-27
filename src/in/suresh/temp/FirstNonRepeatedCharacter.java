package in.suresh.temp;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public abstract class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		String input = "javahun Hungry Java Blog Alive is Awesome";

		Set<Entry<Character, Long>> entrySet = input.toLowerCase().chars().mapToObj(c -> (Character.valueOf((char) c)))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet();

		Character character = entrySet.stream().filter(entry -> entry.getValue() == 1L).map(entry -> entry.getKey())
				.findFirst().get();

		System.out.println(character);

	}
}
