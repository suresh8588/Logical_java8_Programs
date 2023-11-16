package in.suresh.java8;

import java.util.Collections;
import java.util.stream.Collectors;

public class StringReverse {

	public static void main(String[] args) {
		String str = "hello";

		String revString=str.chars().mapToObj(c->String.valueOf((char)c)).collect(Collectors.collectingAndThen(Collectors.toList(), list->{
			Collections.reverse(list);
			
			return String.join("", list);
		}));
		System.out.println(revString);
	}
}
