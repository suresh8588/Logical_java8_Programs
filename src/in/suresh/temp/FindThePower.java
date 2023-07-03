package in.suresh.temp;

import java.util.Scanner;

public class FindThePower {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter base and power values");
		int b = sc.nextInt();
		int p = sc.nextInt();
		int power = power(b, p);
		System.out.println(power);

	}

	public static int power(int b, int p) {

		int power = 1;
		for (int i = 1; i <= p; i++) {
			power = power * b;

		}
		return power;
	}
}
