package in.suresh.temp;

public class REmoveWhiteSpacesInString {
	public static void main(String[] args) {
		String str = "Hi Hello java";
		char[] charArray = str.toCharArray();
		StringBuffer sb = new StringBuffer();

		for (Character c : charArray) {
			if (!Character.isWhitespace(c)) {
				sb.append(c);
			}
		}
		System.out.println(sb);
	}
}
