package testng1;

// import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// import org.testng.annotations.DataProvider;
// import org.testng.annotations.Ignore;
// import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class grouptestcases {
	
	ChromeDriver driver ;
			
	@Test(groups = "login")
	public void login_1() {
		System.out.println("Login_1");
			
	}
	
	@Test(groups = "login")
	public void login_2() {
		System.out.println("Login_2");
	}
	
	@Test(groups = "reset")
	public void resetPassword_1() {
		System.out.println("resetPassword_1");
	}
	
	@Test(groups = "reset")
	public void resetPassword_2() {
		System.out.println("resetPassword_2");
		
	}
}