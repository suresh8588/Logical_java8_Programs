package in.suresh.temp;

import java.util.Arrays;

public class LargestNumberInArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int large = arr[0];
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] > large) {
				large = arr[i];
			}
		}
		System.out.println(large);
		
		//Approach - 2
		
		int max = Arrays.stream(arr).max().getAsInt();
		System.out.println(max);
	}
}
