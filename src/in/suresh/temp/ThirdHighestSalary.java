package in.suresh.temp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ThirdHighestSalary {

	public static void main(String[] args) {
		Integer[] arr = { 1, 6, 1, 7, 1, 6, 9, 8, 7, 9 };
		List<Integer> list = Arrays.asList(arr);
		Optional<Integer> thirdHighestNo = list.stream().sorted(Comparator.reverseOrder()).skip(3).findFirst();
		if (thirdHighestNo.isPresent()) {
			System.out.println(thirdHighestNo);
		} else {
			System.out.println("Number not found");
		}
	}
}
