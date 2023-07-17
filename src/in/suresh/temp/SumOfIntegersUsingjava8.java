package in.suresh.temp;

import java.util.Arrays;
import java.util.List;

public class SumOfIntegersUsingjava8 {
public static void main(String[] args) {
	//Q13). Write a Java 8 program to get the sum of all numbers present in a list.

	   List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3);
	   int sum = integerList.stream().mapToInt(Integer::intValue).sum();
	   System.out.println("Sum is : "+sum);
}
}
