package in.suresh.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ArrayNamesStartsWithA {

	public static void main(String[] args) {
		String[] names = { "Anushka", "Anupama", "Deepika", "Kajol", "Sunny", "Aaridhya" };
		// Approach - 1
		// List<String> list = Arrays.stream(names).filter(i ->
		// i.startsWith("A")).collect(Collectors.toList());
		// System.out.println(list);
		
		Predicate<String> p=name->name.charAt(0)=='A';
		
		for(String name: names) {
			if(p.test(name)) {
				System.out.println("Start with A Character :: "+name);
			}
			else {
				System.out.println("Other than Start with A Character :: "+name);
			}
		}
	}
}
