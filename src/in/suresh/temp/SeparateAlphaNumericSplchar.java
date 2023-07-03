package in.suresh.temp;

public class SeparateAlphaNumericSplchar {

	public static void main(String[] args) {
		String str = "abc124@xa#xyz";
		String alpha = "";
		String digit = "";
		String splChar = "";
		for (int i = 0; i < str.length(); i++) {

			if (Character.isAlphabetic(str.charAt(i))) {
				alpha = alpha + str.charAt(i);
			} else if (Character.isDigit(str.charAt(i))) {
				digit = digit + str.charAt(i);
			} else {
				splChar = splChar + str.charAt(i);
			}
		}
		System.out.println(alpha);
		System.out.println(digit);
		System.out.println(splChar);
	}
}
