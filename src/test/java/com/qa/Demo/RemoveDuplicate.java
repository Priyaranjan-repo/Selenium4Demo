package com.qa.Demo;

public class RemoveDuplicate {
	public static void main(String[] args) {

		String str = "I Love love to To Code code";
		String array[] = str.split(" ");
		String u = array[0] + " ";

		for (int i = 0; i < array.length - 1; i++) {

			if (array[i].equalsIgnoreCase(array[i + 1])) {
				u = u + array[i + 1] + " ";
			}
		}
		System.out.println(u);
	}

}
