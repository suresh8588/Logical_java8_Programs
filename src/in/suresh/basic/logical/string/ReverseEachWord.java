package in.suresh.basic.logical.string;

public class ReverseEachWord {

	public static void main(String[] args) {
		String s = "hello my friend";
		String[] split = s.split(" ");

		for (int i = 0; i < split.length; i++) {
			String x = split[i];
			StringBuffer sb = new StringBuffer(x);
			sb.reverse();
			System.out.print(sb+" ");
		}
	}
}
