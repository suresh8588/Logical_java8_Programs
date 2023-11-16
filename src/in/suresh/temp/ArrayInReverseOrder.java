package in.suresh.temp;

import java.util.stream.IntStream;

public class ArrayInReverseOrder {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		
		//Approach - 1
		IntStream.range(0, arr.length).map(i->arr[arr.length-1-i]).forEach(s->System.out.print(s+" "));
		
		//Approach - 2
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
	}
}
