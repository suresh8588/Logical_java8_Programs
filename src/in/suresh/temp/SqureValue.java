package in.suresh.temp;

import java.util.Scanner;

public class SqureValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();

		int square = square(a);
		System.out.println(square);
	}

	public static int square(int a) {
		int square = 1;
		square = a * a;
		return square;

	}
}
