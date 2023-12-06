package testng1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class testngxmllearning {
	
	ChromeDriver driver ;
	
	@Test(priority = 1)
	public void loginToApplication() throws InterruptedException {
		// Launch browser
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashish\\Chrome Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				 driver = new ChromeDriver();

				// open login page

				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				
				Thread.sleep(10000);
				
				// enter username

				driver.findElement(By.name("username")).sendKeys("Admin");

				// enter password

				driver.findElement(By.name("password")).sendKeys("admin123");

				// click on login button
				WebElement logInButton = driver.findElement(By.xpath("//div[@id='app']/div[@class='orangehrm-login-layout']/div[@class='orangehrm-login-layout-blob']//form[@action='/web/index.php/auth/validate']/div[3]/button[@type='submit']"));
				logInButton.click();
				
				Thread.sleep(5000);

	}
	
	
	@Test(priority = 2)
	public void searchLeave() throws InterruptedException {
		// driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
		
		WebElement Leave = driver.findElement(By.xpath("//div[@id='app']//aside[@class='oxd-sidepanel']/nav[@role='navigation']//ul[@class='oxd-main-menu']//a[@href='/web/index.php/leave/viewLeaveModule']"));
		Leave.click();
		
		
		// //div[@id='app']//div[@class='oxd-table-filter']/div[@class='oxd-table-filter-area']/form[@class='oxd-form']/div[2]/div/div[1]/div//input[@placeholder='Type for hints...']
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='app']//div[@class='oxd-table-filter']/div[@class='oxd-table-filter-area']/form[@class='oxd-form']/div[2]/div/div[1]/div//input[@placeholder='Type for hints...']")).sendKeys("John");
		//WebElement EmployeeName = driver.findElement(By.xpath("//div[@id='app']//div[@class='oxd-table-filter']/div[@class='oxd-table-filter-area']/form[@class='oxd-form']/div[2]/div/div[1]/div//input[@placeholder='Type for hints...']"));
		// Leave.click();
		
		Thread.sleep(10000);
	}

	
	@SuppressWarnings("deprecation")
	// @Ignore
	@Test(priority = 3)
	public void logout() throws InterruptedException {
		driver.findElement(By.xpath("//div[@id='app']/div[@class='oxd-layout']//header[@class='oxd-topbar']//div[@class='oxd-topbar-header-userarea']/ul/li[@class='oxd-userdropdown']//i")).click();
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(1000);
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(1000);
	}
	
	
	@Test(priority = 4)
	public void closeBrowser() {
		driver.close();
	}

}
