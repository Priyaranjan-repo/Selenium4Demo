package com.qa.Demo;

public class STringCompare {

	public static void main(String[] args) {

		String s1 = "demo";
		String s2 = "demo";

		String s4 = new String("demo");

		System.out.println(s1 == s2);// true
		System.out.println(s1 == s4);// False
		System.out.println(s1.equals(s4));// true

	}
}
