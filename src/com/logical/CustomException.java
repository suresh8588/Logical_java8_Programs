package com.logical;

class NodataFoundException extends RuntimeException {

	public NodataFoundException(String msg) {
		super(msg);
	}
}

public class CustomException {

	private static String getName(int id) {
		if (id == 101) {
			return "raju";

		} else if (id == 102) {
			return "rani";
		} else {
			 throw new NodataFoundException("Invalid Id");
		}
	}

	public static void main(String[] args) {
		String name = getName(108);
		System.out.println(name);
	}


}
