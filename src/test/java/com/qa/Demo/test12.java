package com.qa.Demo;

public class test12 {

	public static void main(String[] args) {

		String s = "12345";
		// char c[] = s.toCharArray();

		String output = "";
		for (int i = 0; i < s.length(); i++) {

			for (int j = 0; j <= i; j++) {
				output = output + s.charAt(i);
			}
		}
		System.out.print(output);
	}
}
