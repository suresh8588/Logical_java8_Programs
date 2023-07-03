package in.suresh.temp;

import java.util.Arrays;
import java.util.List;

public class SortIntgerArray {

	public static void main(String[] args) {
		Integer arr[] = { 1, 0, 1, 0, 0, 1, 1 };
		List<Integer> list = Arrays.asList(arr);
		list.stream().sorted().forEach(i -> System.out.print(i + " "));

	}
}
