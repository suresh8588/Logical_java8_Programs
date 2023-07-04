package in.suresh.temp;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String ");
		String str = sc.nextLine();
		togglestr(str);
		sc.close();
	}

	private static void togglestr(String str) {

		for (Character ch : str.toCharArray()) {

			if (ch >= 65 && ch <= 90) {
				ch = (char) (ch + 32);
			} else if(ch >= 97 && ch <= 122)  {
				ch = (char) (ch - 32);
			}
			else if(ch==32) {
				ch=(char) (ch+3);
			}
			
			System.out.print(ch+"");
		}
	}
}
