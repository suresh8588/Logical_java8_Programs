package in.suresh.temp;

import java.util.Random;

public class RandomText {

	public static void main(String[] args) {
	//	int length = 5;
		generateRandomText(5);
	}

	private static void generateRandomText(int length) {

		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < length; i++) {
			int index = random.nextInt(characters.length());
			char randomChars = characters.charAt(index);
			sb.append(randomChars);
		}
		System.out.println(sb.toString());

	}
}
