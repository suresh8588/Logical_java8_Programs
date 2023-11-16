package in.suresh.basic.logical.array;

import java.util.Arrays;

public class RemoveElementInArray {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		int remove = 4;
		int[] newArray = new int[array.length - 1];
		int index = 0;

		for(
		int i = 0;i<array.length;i++)
		{

			if (array[i] != remove) {
				newArray[index] = array[i];
				index++;
			}
		}System.out.println(Arrays.toString(newArray));
	}
	
}
