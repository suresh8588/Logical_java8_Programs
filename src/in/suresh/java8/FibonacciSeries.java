package in.suresh.java8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FibonacciSeries {



	public static void main(String[] args) {
		Integer a = 20;

		List<Integer> list = Stream.iterate(new int[] { 0, 1 }, s -> new int[] { s[1], s[0] + s[1] }).limit(a)
				.map(n -> n[0]).collect(Collectors.toList());

		for (Integer integer : list) {
			System.out.print(integer + " ");
		}
	}


}
