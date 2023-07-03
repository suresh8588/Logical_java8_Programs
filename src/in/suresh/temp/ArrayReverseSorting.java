package in.suresh.temp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayReverseSorting {



	public static void main(String[] args) {
		Integer arr[] = { 6, 8, 0, 7, 4, 6, 4 };
		String result = "";

		List<Integer> list = Arrays.asList(arr);
		List<Integer> list2 = list.stream().sorted((s1, s2) -> -s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println(list2);
		
		for (Integer integer : list2) {
			result = result + integer;
		}
		System.out.println(result);
	}

}
