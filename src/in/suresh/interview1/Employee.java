package in.suresh.interview1;

import java.util.Arrays;

public class Employee {
	public static void main(String[] args) {

		Integer[] array = { 1, 2, 3, 4, 5 };

		Integer sum = Arrays.stream(array).reduce(1, (a, b) -> (a > b) ? a : b);
		System.out.println(sum);
	}

}
