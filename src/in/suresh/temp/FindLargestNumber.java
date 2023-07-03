package in.suresh.temp;

public class FindLargestNumber {

	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		int c = 300;

		if (a > b && a > c) {
			System.out.println(a);
		} else if (b > a && b > c) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}
		
		
		
		//Aproach - 2
		int large=c>(a>b?a:b)?c:(a>b?a:b);
		System.out.println(large);
	}
}
