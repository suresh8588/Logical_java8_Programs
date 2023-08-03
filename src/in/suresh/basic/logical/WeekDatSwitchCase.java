package in.suresh.basic.logical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WeekDatSwitchCase {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number ");

		String string = br.readLine();
		int num = Integer.parseInt(string);
		switch (num) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Day not found");

		}

	}
}
