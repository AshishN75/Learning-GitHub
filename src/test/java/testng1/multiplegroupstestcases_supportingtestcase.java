package testng1;

import org.testng.annotations.Test;

public class multiplegroupstestcases_supportingtestcase {
	
	//sanity
	@Test(groups = "sanity")
	
	public void createAccountTest() {
		System.out.println("Account is created");
	}

}
