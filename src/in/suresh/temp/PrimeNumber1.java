package in.suresh.temp;

public class PrimeNumber1 {

	public static void main(String[] args) {

		int num = 1;
		int n = 30;
		int count = 0;

		while (num <= n) {

			for (int i = 1; i <= n; i++) {
				if (num % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.print(num + " ");
			}
			count = 0;
			num++;
		}
	}
}
