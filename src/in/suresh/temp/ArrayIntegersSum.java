package in.suresh.temp;

import java.util.Arrays;

public class ArrayIntegersSum {

	public static void main(String[] args) {
		int[] array= {2,3,4,5,6};
		
		int sum = Arrays.stream(array).sum();
		System.out.println(sum);
	}
}
