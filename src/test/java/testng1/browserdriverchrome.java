package testng1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class browserdriverchrome {
	
	@Test
	public void launchGooglePage() {
		
		// launch browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashish\\Chrome Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		
	}

}
