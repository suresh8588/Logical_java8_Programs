package in.suresh.basic.logical.string;

public class CharOcc {

	public static void main(String[] args) {
		String s = "java";
		char ch = 'j';
		char[] array = s.toCharArray();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (array[i] == ch) {
				count++;
			}
		}
		System.out.println(ch + "= " + count);
	}
}
