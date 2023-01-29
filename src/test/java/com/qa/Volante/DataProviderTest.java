package com.qa.Volante;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	@Test(dataProvider = "myTest")
	public void testcase(String uname, String psw) {
		System.out.println(uname);
		System.out.println(psw);
	}

	@DataProvider
	public Object[][] myTest() {
		return new Object[][] { { "user1", "pass1" }, { "user2", "pass2" }, { "user3", "pass3" } };

	}
}
