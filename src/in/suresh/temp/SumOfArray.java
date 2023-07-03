package in.suresh.temp;

public class SumOfArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int sum = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			sum = sum + arr[i];
		}
		System.out.print(sum);
	}
}
