package com.string;

public class CharOccurance {

	public static void main(String[] args) {
		String s = "hai java";
		//char ch = 'a';
		char arr[] = s.toCharArray();
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 'a') {
				count++;
			}
		}
		System.out.println(count);
	}
}
