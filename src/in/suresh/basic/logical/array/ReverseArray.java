package in.suresh.basic.logical.array;

public class ReverseArray {
	public static void main(String[] args) {
		Integer[] arr = { 15, 8, 9, 2, 11, 4 };

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}

	}
}
