package in.suresh.temp;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatedCharacterUsingStreams {
	public static void main(String[] args) {
		String input = "Java Articles are Awesome";

        Character result = input.chars()
        .mapToObj(s->Character.toLowerCase(Character.valueOf((char) s)))
        .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap:: new, Collectors.counting()))
        .entrySet()
        .stream()
        .filter(entry->entry.getValue()>1L)
        .map(entry->entry.getKey())
        .findFirst().get();
        System.out.println(result);
	}
}
