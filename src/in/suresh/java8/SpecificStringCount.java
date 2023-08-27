package in.suresh.java8;

import java.util.Arrays;
import java.util.List;

public class SpecificStringCount {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "apple");
		long count = list.stream().filter(s -> s.equals("apple")).count();
		System.out.println("apple count is : " + count);
	}
}
