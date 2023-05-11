package TestNGfirstcode;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Creatorgtest {
	@BeforeMethod
public void configBM() {
	System.out.println("============Launch the Browser");
	System.out.println("==login===");
}
	@AfterMethod
public void configAm() {
	System.out.println("==loging==");
	System.out.println("=======close the Browser");
	}
    @Test
	public void creatOrgTest() {
		System.out.println("navigate to org module");
		System.out.println("create org with industries");
		System.out.println("verify");
	}
    @Test
	public void createOrgwithIndustries() {
		System.out.println("navigate to Org module");
		System.out.println("create Org with industries");
		System.out.println("verify");
	}	
		@Test
	public void createOrgwithRatingTest() {
		System.out.println("navigate to Org Module");
		System.out.println("create Org with rating");
		System.out.println("verify");
	}
}
	
	



