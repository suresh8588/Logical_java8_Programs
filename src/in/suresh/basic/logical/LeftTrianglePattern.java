package in.suresh.basic.logical;

public class LeftTrianglePattern {
	public static void main(String[] args) {
		int rows = 5;
		for (int i = 1; i <= rows; i++) {
			// Inner loop for printing spaces before the asterisks
			for (int j = 1; j <= rows - i; j++) {
				System.out.print(" ");
			}

			// Inner loop for printing asterisks in each row
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}

			System.out.println(); // Move to the next line after each row
		}
	}
}
