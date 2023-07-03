package com.string;

public class SwapStrings {

	public static void main(String[] args) {
		String a = "java";
		String b = "program";
		a = a + b; //javaprogram 

		b = a.substring(0, a.length() - b.length());  //11-7
		a = a.substring(b.length());
		System.out.println("a= " + a);
		System.out.println("b= " + b);

	}

}
