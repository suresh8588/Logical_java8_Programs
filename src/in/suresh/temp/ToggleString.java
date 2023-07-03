package in.suresh.temp;

public class ToggleString {
	public static void main(String[] args) {
		String str = "AshokIT";

		// Approach - 1
		String s = "";

		for (int i = 0; i <= str.length() - 1; i++) {

			if (Character.isUpperCase(str.charAt(i))) {
				s = s + Character.toLowerCase(str.charAt(i));
			} else {
				s = s + Character.toUpperCase(str.charAt(i));
			}
		}

		System.out.println(s);

		// Approach -2
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i <= str.length() - 1; i++) {

			if (Character.isUpperCase(str.charAt(i))) {
				sb.append(Character.toLowerCase(str.charAt(i)));
			} else {
				sb.append(Character.toUpperCase(str.charAt(i)));
			}
		}

		System.out.println(sb);

	}
}
