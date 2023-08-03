package in.suresh.basic.logical.array;

import java.util.Arrays;

public class ArraySorting {
	public static void main(String[] args) {

		Integer[] arr = { 15, 8, 9, 2, 11, 4 };
		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
