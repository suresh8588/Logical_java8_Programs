package com.string;

public class ReverseEachWord {

	public static void main(String[] args) {
		String s = "Hello My Friend";
		String[] split = s.split(" ");

		for (int i = 0; i < split.length; i++) {
			String string = split[i];
			StringBuffer sb = new StringBuffer(string);
			sb.reverse();
			System.out.print(sb+" ");
		}
	}
}
