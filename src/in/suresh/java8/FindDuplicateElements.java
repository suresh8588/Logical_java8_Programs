package in.suresh.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicateElements {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 5, 6, 3, 7);


		Map<Integer, Long> map = numbers.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));

		map.forEach((k, v) -> {
			if (v > 1) {
				System.out.print(k + " ");
			}
		});
	}
}
