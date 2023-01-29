package com.qa.Demo;

public class ReveseEachWord {

	public static void main(String[] args) {

		String input = "Welcome to Selenium";
		System.out.println("Original string:" + input);

		String[] words = input.split(" ");
		String output = "";
		for (String word : words) {
			String revWord = "";
			for (int i = word.length() - 1; i >= 0; i--) {
				revWord = revWord + word.charAt(i);
			}
			// output = revWord + " " + output;
			output = output + revWord + " ";
		}
		System.out.println(output);
	}
}
