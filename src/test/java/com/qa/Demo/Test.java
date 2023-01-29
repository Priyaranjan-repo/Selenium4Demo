package com.qa.Demo;

public class Test {

	public static void main(String[] args) {

		/*
		 * String s1 = "demo"; String s2 = "demo"; String s3 = "java";
		 * 
		 * String s4 = new String("demo");
		 * 
		 * System.out.println(s1 == s2); System.out.println(s1 == s3);
		 * System.out.println(s1.equals(s2)); System.out.println(s1 == s4);
		 * System.out.println(s1.equals(s4));
		 * 
		 * }
		 */

		String str = "TravelIndia";
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}
}
