package in.suresh.temp;

public class ReverseStringWords {

	public static void main(String[] args) {
		String str = "hello i am java developer";

		String[] array = str.split(" ");

		for (int i = 0; i < array.length; i++) {
			String words = array[i];
			StringBuffer sb = new StringBuffer(words);
			sb.reverse();
			System.out.print(sb + " ");

		}
	}
}
