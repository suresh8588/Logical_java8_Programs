package in.suresh.basic.logical.string;

public class SwapTwoStrings {

	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "program";

		s1 = s1 + s2;
		s2 = s1.substring(0, s1.length() - s2.length());
		s1 = s1.substring(s2.length());

		System.out.println("String s1= " + s1);
		System.out.println("String s2= " + s2);
	}
}
