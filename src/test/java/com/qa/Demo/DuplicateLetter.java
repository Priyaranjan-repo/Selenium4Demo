package com.qa.Demo;

import java.util.HashMap;
import java.util.Iterator;

public class DuplicateLetter {

	public static void main(String[] args) {

		String s = "aabbccdee";
		String output = "";
		char[] chars = s.toCharArray();
		HashMap<Character, Integer> map = new HashMap();

		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);

			} else {
				map.put(s.charAt(i), 1);
			}
		}
		Iterator it = map.keySet().iterator();
		while (it.hasNext()) {
			output = output + it.next();

		}
		System.out.print(output);
	}

}
