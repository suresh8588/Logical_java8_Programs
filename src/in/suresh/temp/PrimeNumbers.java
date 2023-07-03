package in.suresh.temp;

public class PrimeNumbers {

	public static void main(String[] args) {

		boolean prime = isPrime(11);
		if (prime) {
			System.out.println("Given number is prime number");
		} else {
			System.out.println("given number is not a prime number");
		}
	}

	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
