package in.suresh.temp;

public class Pattern000111 {
	public static void main(String[] args) {
		Integer[] arr = { 1, 0, 1, 0, 1, 0 };
		Integer[] output = new Integer[arr.length];
		int oddZeros = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				oddZeros++;
			}
		}
		for (int i = 0; i < oddZeros; i++) {
			output[i] = 0;
		}
		for (int i = oddZeros; i < output.length; i++) {
			output[i] = 1;
		}
		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i] + " ");
		}
	}
}
