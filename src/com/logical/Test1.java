package com.logical;

public class Test1 {

	public static void main(String[] args) {

		String str = "suresh shiva";
		int count = 0;
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {

			for (int j = i + 1; j < charArray.length; j++) {
				if (charArray[i] == charArray[j]) {
					System.out.println(charArray[j]);
					count++;
					break;
				}
			}
		}
	
	}

}
