package in.suresh.temp;

public class PalindromeNumber {

	public static void main(String[] args) {
		int n = 12221;
		int revNum = 0;
		int orgNum = n;

		while (n != 0) {
			revNum = revNum * 10 + n % 10;
			n = n / 10;

		}
		if (revNum == orgNum) {
			System.out.println("Palindrome Number");
		} else {
			System.out.println("Not a Palindrome");
		}
	}
}
