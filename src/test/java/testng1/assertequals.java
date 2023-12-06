package testng1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class assertequals {
	
	@Test
	public void loginToOrangeHRM() throws InterruptedException {
		// Launch browser
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashish\\Chrome Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				
				
				// open login page
				
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				
				Thread.sleep(10000);
				
				// enter username
				
				driver.findElement(By.name("username")).sendKeys("Admin");
				
				
				// enter password
				
				driver.findElement(By.name("password")).sendKeys("admin123");
				
			
				// click on login button
				//driver.findElement(By.name("submit")).click();
				
				// //div[@id='app']/div[@class='orangehrm-login-layout']/div[@class='orangehrm-login-layout-blob']//form[@action='/web/index.php/auth/validate']/div[3]/button[@type='submit']
				
//			 	click login button
				WebElement logInButton = driver.findElement(By.xpath("//div[@id='app']/div[@class='orangehrm-login-layout']/div[@class='orangehrm-login-layout-blob']//form[@action='/web/index.php/auth/validate']/div[3]/button[@type='submit']"));
				logInButton.click();
				
			
				// Assertions 
				
			String actualurl = 	driver.getCurrentUrl();
			
			String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
				
				
			Assert.assertEquals(actualurl, expectedUrl);
				
				
				
				
				
	}

}
