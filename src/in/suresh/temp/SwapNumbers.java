package in.suresh.temp;

public class SwapNumbers {

	public static void main(String[] args) {
		int a = 100;
		int b = 200;

		int c = a + b;
		b = c-b;
		a = c-b;

		/*a = a + b;
		b = a - b;
		a = a - b;*/
		System.out.println("a = " + a + " b= " + b);
	}
}
