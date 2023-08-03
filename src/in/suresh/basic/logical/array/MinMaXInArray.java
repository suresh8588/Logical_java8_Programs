package in.suresh.basic.logical.array;

public class MinMaXInArray {
	public static void main(String[] args) {
		Integer[] arr = { 15, 8, 9, 2, 11, 4 };

		int min = arr[0];
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(min);
		System.out.println(max);
	}
}
