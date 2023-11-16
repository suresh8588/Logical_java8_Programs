package in.suresh.streams;

public class SumOfThreeIntegersInArray {

	public static void main(String[] args) {
		Integer[] array = { 1, 2, -1, 3, -2, 1, 4, 3, 2, -1, 3, 4, 6, 1 };
		int total = 9;
		int sum;

		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length ; j++) {
				for (int k = j+1; k < array.length; k++) {
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
