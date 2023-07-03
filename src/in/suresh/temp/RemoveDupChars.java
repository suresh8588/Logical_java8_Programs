package in.suresh.temp;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupChars {

	public static void main(String[] args) {

		// Approach - 1
		String str = "programming";
		StringBuilder sb = new StringBuilder();
		str.chars().distinct().forEach(c -> sb.append((char) c));
		System.out.println(sb.toString());

		// Approach - 1

		StringBuilder sb2 = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int idx = str.indexOf(ch, i + 1);
			if (idx == -1) {
				sb2.append(ch);
			}

		}
		System.out.println(sb2);

		// Approch- 3

		char[] array = str.toCharArray();
		StringBuilder sb3 = new StringBuilder();
		for (int i = 0; i < array.length; i++) {
			boolean repeated = false;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					repeated = true;
					break;
				}
			}
			if (!repeated) {
				sb3.append(array[i]);
			}
		}
		System.out.println(sb3);

		StringBuilder sb4 = new StringBuilder();
		Set<Character> set = new LinkedHashSet<>();

		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}

		for (Character c : set) {
			sb4.append(c);
		}

		System.out.println(sb4);

	}
}
