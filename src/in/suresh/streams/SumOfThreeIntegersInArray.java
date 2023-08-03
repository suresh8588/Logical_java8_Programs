package in.suresh.streams;

public class SumOfThreeIntegersInArray {

	public static void main(String[] args) {
		Integer[] array = { 1, 2, -1, 3, -2, 1, 4, 3, 2, -1, 3, 4, 6, 1 };
		int total = 9;
		int sum;

		for (int i = 0; i < array.length - 2; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				for (int k = 0; k < array.length; k++) {
					sum = array[i] + array[j] + array[k];
					if (sum == total) {
						System.out.println(array[i] + ", " + array[j] + ", " + array[k]);
						return;
					}
				}
			}
		}
	}

}
