package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class iTestlistener {
	
	ChromeDriver driver;
	
	@Test
	public void loginToOrangeHRM() throws InterruptedException {
		// Launch browser
				// System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashish\\Chrome Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				//ChromeDriver 
		
				driver = new ChromeDriver();
				
				
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
				
			
		}
		
	// Assertions - here we are creating separate methods to do the assertions 
	// we want testng to consider all these methods as test cases
	
				@Test
				public void testAdmin() throws InterruptedException {
					Thread.sleep(10000);
					driver.findElement(By.xpath("//div[@id='app']//aside[@class='oxd-sidepanel']/nav[@role='navigation']//ul[@class='oxd-main-menu']//a[@href='/web/index.php/admin/viewAdminModule']/span[.='Admin']")).click();	
					Thread.sleep(10000);
					boolean isDisplayed = driver.findElement(By.xpath("//div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']//h5[.='System Users']")).isDisplayed();
				
				Assert.assertTrue(isDisplayed);
				
				}
				@Test
				public void testLogout() {
					driver.findElement(By.xpath("//div[@id='app']/div[@class='oxd-layout']//header[@class='oxd-topbar']//div[@class='oxd-topbar-header-userarea']/ul/li[@class='oxd-userdropdown']//i")).click();	
					driver.findElement(By.xpath("//div[@id='app']//header[@class='oxd-topbar']//div[@class='oxd-topbar-header-userarea']/ul/li/ul[@role='menu']/li[4]/a[@role='menuitem']")).click();
				
				}
				
				
				
	
	
	

}
