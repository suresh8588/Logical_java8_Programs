package com.string;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList<Integer> l= new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.forEach(e->System.out.print(e+" "));
		
	}
}
