package in.suresh.temp;

import java.util.Random;

public class Test {

	public static void main(String[] args) {

		int length = 5;
		generateRandomOTP(length);

	}

	private static void generateRandomOTP(int length) {
		String numbers = "0123456789";
		StringBuilder sb = new StringBuilder();
		Random rand = new Random();

		for (int i = 0; i < length; i++) {
			int index = rand.nextInt(numbers.length());
			char otp = numbers.charAt(index);
			sb.append(otp);
		}
		System.out.println(sb);

	}
}
