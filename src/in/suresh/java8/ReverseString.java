package in.suresh.java8;

import java.util.stream.Collectors;

public class ReverseString {

	public static void main(String[] args) {
		String str = "suresh";
		String string = str.chars().mapToObj(c -> (char) c).collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
			java.util.Collections.reverse(list);
			return list.stream().map(Object::toString).collect(Collectors.joining());
		}));
		System.out.println(string);
	}
}
