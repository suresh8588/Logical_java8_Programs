package in.suresh.temp;

public class PrintNumbersInWords {

	public static void main(String[] args) {

		int[] numbers = { 4, 22 };
		String[] words = { "Four", "Twenty Two" };

		for (int i = 0; i < numbers.length; i++) {
			int number = numbers[i];
			String word = words[i];
			System.out.println(number + " = " + word);
		}
	}
}
