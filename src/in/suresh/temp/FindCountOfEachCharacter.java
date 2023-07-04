package in.suresh.temp;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * 
 * Write a program to print the count of each character in a String?
 *
 */
public class FindCountOfEachCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Sting ");
		String str = sc.nextLine();
		sc.close();

		findCountOfCharacter(str);
	}

	private static void findCountOfCharacter(String str) {
		
		LinkedHashMap<String,Long> map = Arrays.stream(str.split("")).map(String::toLowerCase)
		.collect(Collectors.groupingBy(s->s, LinkedHashMap::new, Collectors.counting()));
		System.out.println(map);
		
		/*
		LinkedHashMap<String,Long> map = Arrays.stream(str.split(""))
		//.map(String::toLowerCase)
		.collect(Collectors.groupingBy(s->s, LinkedHashMap::new, Collectors.counting()));
		System.out.println(map);
		*/
	}
}
