package com.hrm.testcases;

import org.testng.annotations.Test;

import com.hrm.pages.locators.HomePage;

public class HomePageTest extends BaseTestforBrowserDriver{
	
	
	@Test
	public void logout() {
		HomePage homePage = new HomePage();
		
		homePage.logoutFromApplication();
	}

}
