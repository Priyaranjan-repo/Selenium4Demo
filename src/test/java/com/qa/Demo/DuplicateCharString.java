package com.qa.Demo;

import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicateCharString {

	public static void main(String[] args) {

		String input = "Selenium  $$ __";
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		char[] chars = input.toCharArray();

		for (char ch : chars) {
			if (!map.containsKey(ch)) {
				map.put(ch, 1);
			} else {
				int count = map.get(ch);
				map.put(ch, count + 1);

			}
		}
		System.out.println(map);
	}
}
