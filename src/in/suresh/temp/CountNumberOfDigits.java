package in.suresh.temp;

public class CountNumberOfDigits {

	public static void main(String[] args) {

		int countDigits = countDigits(12345);
		System.out.println(countDigits);
	}

	public static int countDigits(int num) {

		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		return count;
	}
}
