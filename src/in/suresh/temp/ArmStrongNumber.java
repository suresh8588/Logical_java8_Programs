package in.suresh.temp;

public class ArmStrongNumber {

	public static void main(String[] args) {
		int n = 153;
		int temp=n;
		int a = 0, c = 0;
		while (n > 0) {
			a = n % 10;
			c = c + (a * a * a);
			n = n / 10;
		}
		if(temp==c) {
			System.out.println(temp +" is a armstrong number");
		}
		else {
			System.out.println(temp +" is not a armstrong number");

		}
	}
}
