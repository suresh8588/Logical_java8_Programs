package in.suresh.basic.logical.string;

public class Test {
	public static void main(String[] args) {
		String inputString = "coderolls";
		char[] arr = inputString.toCharArray();
		char ch = 'o';
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ch) {
				count++;
			}

		}
		System.out.println(ch + " = " + count);

	}
}
