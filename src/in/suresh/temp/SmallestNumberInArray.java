package in.suresh.temp;

import java.util.Arrays;

public class SmallestNumberInArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int small = arr[0];
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] < small) {
				small = arr[i];
			}
		}
		System.out.println(small);
		
		//Approach - 2
		
		int max = Arrays.stream(arr).min().getAsInt();
		System.out.println(max);
	}
}
