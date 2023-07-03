package in.suresh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Arrays1 {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "Suresh", 10000.0);
		Employee e2 = new Employee(2, "Ramesh", 20000.0);
		Employee e3 = new Employee(3, "Naresh", 30000.0);
		List<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		Optional<Integer> second = list.stream().map(Employee::getId).sorted(Comparator.reverseOrder()).skip(1)
				.findFirst();
		System.out.println(second);

	}
}
