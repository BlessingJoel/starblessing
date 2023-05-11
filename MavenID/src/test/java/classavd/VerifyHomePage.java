package classavd;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class VerifyHomePage {
	
	public class SampleTest extends BaseClass{
		@Test
		public void verifyHomepage() {
			System.out.println("====Test START====");
			String expected = "Home".trim();
			System.out.println("capture page title");
			//driver.getTittl
			String actTitle = driver.getTittle().trim();
			Assert.assertEquals(actTitle,expectedTitle);
			System.out.println("====Test End===");
		}
		public void verifyLogoInHomepage() {
			System.out.println("capture the logo status");
			 String actStstus = driver.findElement(By.xpath("//img[@title='vtiger-crm-logo.gif']"));
			 Assert.assertTrue(actStstus);
			 System.out.println("===Test END");

			
			
		}
}
}
