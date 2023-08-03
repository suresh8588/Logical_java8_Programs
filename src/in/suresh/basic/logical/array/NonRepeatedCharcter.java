package in.suresh.basic.logical.array;

import java.util.HashMap;

public class NonRepeatedCharcter {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 2, 1, 3, 4, 5, 2 };

		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					map.put(arr[i], count + 1);
					count++;
				}
			}
			if (count > 1) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println("\n"+ map);

	}
}
