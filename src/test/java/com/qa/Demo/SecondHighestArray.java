package com.qa.Demo;

import java.util.Arrays;

public class SecondHighestArray {

	public static void main(String[] args) {

		// 2nd Highest nu. in java;
		int[] arr = { (int) 1222.87, 22, 64565, 89 };

		// List<Integer> li=new ArrayList<Integer>();
		Arrays.sort(arr);
		System.out.println(arr[arr.length - 1]);

	}

}
