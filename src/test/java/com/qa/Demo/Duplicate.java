package com.qa.Demo;

public class Duplicate {

	public static void main(String[] args) {

		String a = "abc";
		String b = "abc";
		a.concat(b);
		System.out.println(a.concat(b));
		System.out.println(a);

	}
}
