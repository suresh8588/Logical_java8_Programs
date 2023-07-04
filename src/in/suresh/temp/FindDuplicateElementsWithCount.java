package in.suresh.temp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 
 * How to find only duplicate elements with its count from the String ArrayList in Java8?
 *
 */

public class FindDuplicateElementsWithCount {

	public static void main(String[] args) {

		String[] arr = { "Suresh", "Naresh", "Praveen", "Naresh" };
		
		List<String> list = Arrays.asList(arr);
		
		Map<String, Long> map = list.stream().filter(x->Collections.frequency(list, x)>1)
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);
		
		

	}
}
