package in.suresh.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicateElemtsInSrtring {

	public static void main(String[] args) {
		List<String> numbers = Arrays.asList("suresh", "naresh", "praveen", "raju", "naresh");


		Map<String, Long> map = numbers.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));

		map.forEach((k, v) -> {
			if (v > 1) {
				System.out.print(k + " ");
			}
		});
	}
}
