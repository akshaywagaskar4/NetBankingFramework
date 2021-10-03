package com.TestCases;

import org.testng.annotations.Test;

import com.PageObject.LoginTest;

public class TC_1LoginFunction extends BaseClass {
	
	@Test
	public void tc_1() {
		LoginTest lg= new LoginTest(driver);
		lg.setusername(username);
		lg.setPassword(password);
		lg.setlogin();
		
	}

}
