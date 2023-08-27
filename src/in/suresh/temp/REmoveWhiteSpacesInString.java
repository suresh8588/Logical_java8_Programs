package in.suresh.temp;

public class REmoveWhiteSpacesInString {
	public static void main(String[] args) {
		
		// 1st Approach
		String str = "Hi Hello java";
		char[] charArray = str.toCharArray();
		StringBuffer sb = new StringBuffer();

		for (Character c : charArray) {
			if (!Character.isWhitespace(c)) {
				sb.append(c);
			}
		}
		System.out.println(sb);
		
		
		// 2nd Approach
		
		String str1 = "Selenium   tutorial point";

		char[] charArray1 = str1.toCharArray();
		StringBuffer sb1 = new StringBuffer();
		for (int i = 0; i < charArray1.length; i++) {
			if (charArray1[i] != ' ' && charArray1[i] != '\t') {
				sb1.append(charArray1[i]);
			}

		}
		System.out.println(sb1.toString());
	}
}
