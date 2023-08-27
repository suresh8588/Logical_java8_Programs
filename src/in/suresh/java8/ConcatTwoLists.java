package in.suresh.java8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatTwoLists {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);

		List<Integer> list2 = new ArrayList<>();
		list2.add(3);
		list2.add(5);
		list2.add(2);
		System.out.println("================Dupicate elements in two lists=============");
		Set<Integer> set = new HashSet<>(list1);
		List<Integer> list = list2.stream().filter(set::contains).collect(Collectors.toList());
		System.out.println(list);

		System.out.println("================Two lists addition =============");

		Set<Integer> list3 = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toSet());

		System.out.println(list3);

	}
}
