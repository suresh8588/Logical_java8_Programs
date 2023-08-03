package in.suresh.basic.logical;

public class RightTrianglePattern {
	public static void main(String[] args) {
		int rows = 5;
		for (int i = 1; i <= rows; i++) {
			// Inner loop for printing asterisks in each row
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println(); // Move to the next line after each row
		}
	}
}
