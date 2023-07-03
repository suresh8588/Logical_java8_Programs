package com.logical;

class Singleton {

	private static Singleton s = null;

	private Singleton() {
		// TODO Auto-generated constructor stub
	}

	public static Singleton getInstance() {

		if (s == null) {
			return s=new Singleton();
		}
		return s;
	}
}

public class TestSingleton {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}