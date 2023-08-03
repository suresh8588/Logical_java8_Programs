package in.suresh.temp;

import java.util.HashSet;

public class Test1 {
	public static void main(String[] args) {
		HashSet shortSet = new HashSet();

		for (int i = 2; i < 10; i++) {
	    shortSet.add(i);
	    shortSet.remove(i - 1);
	}

	System.out.println(shortSet.size());
	}
}
