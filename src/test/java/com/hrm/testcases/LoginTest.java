package com.hrm.testcases;

import org.testng.annotations.Test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.hrm.pages.locators.LoginPage;

import com.excelutility.ExcelUtility;

public class LoginTest extends BaseTestforBrowserDriver{

	@Test
	public void loginWithValidUserNameAndValidPassword() throws InvalidFormatException, IOException {

		LoginPage loginPage = new LoginPage();

		// loginPage.loginToApplication("Admin", "admin123"); => this was used until we started apache poi library
		
		// now we'll modify this and read the data from the excel sheet
		
		loginPage.loginToApplication(ExcelUtility.getTestData(1, 0), ExcelUtility.getTestData(1, 1));

	}

}
