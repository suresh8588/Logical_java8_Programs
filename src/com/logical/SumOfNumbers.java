package com.logical;

import java.util.Arrays;
import java.util.List;

public class SumOfNumbers {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		
		{
			Integer sum=0;
			for (Integer integer : numbers) {
				sum=sum+integer;
			}
			System.out.println(sum);
		};
	}
}
