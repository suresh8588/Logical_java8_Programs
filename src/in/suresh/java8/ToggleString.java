package in.suresh.java8;

public class ToggleString {
	public static void main(String[] args) {
		String str = "Java Articles arej Awesome";
		String string = str.chars()
				.mapToObj(c -> Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c))
				.collect(StringBuffer::new, StringBuffer::appendCodePoint, StringBuffer::append).toString();

		System.out.println(string);
	}
}
