package com.qa.Volante;

import org.testng.annotations.Test;

public class TestNGDemoTest {
	@Test(priority = 2)
	public void f1() {
		System.out.println("i m in f1");
	}

	@Test(priority = 3)
	public void f2() {
		System.out.println("i m in f2 ");
	}

	@Test(priority = 1)
	public void f3() {

		System.out.println("i m in f3 ");
	}

	@Test(priority = 4)
	public void f4() {
		System.out.println("i m in f4");
	}
}
