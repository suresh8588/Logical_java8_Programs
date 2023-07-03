package in.suresh.temp;

public class ReverseString {

	public static void main(String[] args) {
		String s = "suresh";
		String revString = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			revString = revString+s.charAt(i);
		}
		System.out.println(revString);
	}
}
