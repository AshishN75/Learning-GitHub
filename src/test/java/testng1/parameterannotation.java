package testng1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class parameterannotation {
	
	ChromeDriver driver ;
	
	
	
	@Parameters({"Username", "Password"})
	@Test(priority = 1)
	public void loginToApplication(String userName, String passWord) throws InterruptedException {
		// Launch browser
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashish\\Chrome Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				 driver = new ChromeDriver();

				// open login page

				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				
				Thread.sleep(10000);
				
				// enter username

				driver.findElement(By.name("username")).sendKeys(userName);

				// enter password

				driver.findElement(By.name("password")).sendKeys(passWord);

				// click on login button
				WebElement logInButton = driver.findElement(By.xpath("//div[@id='app']/div[@class='orangehrm-login-layout']/div[@class='orangehrm-login-layout-blob']//form[@action='/web/index.php/auth/validate']/div[3]/button[@type='submit']"));
				logInButton.click();
				
				Thread.sleep(5000);
	}
	}