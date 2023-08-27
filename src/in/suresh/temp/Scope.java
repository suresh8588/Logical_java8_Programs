package in.suresh.temp;

public class Scope {
	private static int x = 0;
	private int y;

	public Scope() {
		y = x++;
	}

	public void print() {
		Scope scope = new Scope();
		System.out.println(y + "," + x + "," + scope.y + "," + scope.x);
	}

	public static void main(String[] args) {
		for (int i = 0; i < 2; i++) {
			Scope scope2 = new Scope();
			scope2.print();
		}
	}
}
