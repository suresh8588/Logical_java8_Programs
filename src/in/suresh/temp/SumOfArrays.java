package in.suresh.temp;

import java.util.Arrays;
import java.util.OptionalDouble;

public class SumOfArrays {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int sum = 0;

		int sum2 = Arrays.stream(arr).sum();
		System.out.println("Java 8  sum is : " + sum2);

		OptionalDouble average = Arrays.stream(arr).average();
		System.out.println("Avarage value is : "+average);

		for (int i = 0; i <= arr.length - 1; i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);
		/*
		 * for(Integer value: arr) { sum=sum+value; } System.out.println(sum);
		 * 
		 */
	}
}
