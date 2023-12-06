package testng1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsonexample {
	
	@Test
	public void applyleave() {
		 
	Assert.assertEquals	(true, false); // here we are purposefully failing this TC 
	// as expected = false and actual = true so that we can test that dependson is working or not
		System.out.println("Leave is applied");
		
	}
	
	@Test(dependsOnMethods = "applyleave")
	public void  approveleave() {
		
		System.out.println("Leave is approved");
	}
	

}
