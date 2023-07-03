package in.suresh.temp;

public class PalindromeString {
	public static void main(String[] args) {
		String s = "mam";
		String revString = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			revString = revString + s.charAt(i);
		}
		if (s.equalsIgnoreCase(revString)) {

			System.out.println(revString + " is a Palindrome");
		} else {
			System.out.println(revString + " is not a Palindrome");
		}
	}
}
