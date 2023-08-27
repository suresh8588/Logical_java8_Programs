package in.suresh.temp;

public class Test {

	public static void main(String[] args) {
		
		int b;
		int p;
		Integer power = power(2, 4);
		System.out.println(power);
	}

	private static Integer power(int b, int p) {

		int power = 1;

		for (int i = 0; i < p; i++) {
			power = power * b;

		}
		return power;
	}

}
