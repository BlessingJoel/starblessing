package classavd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class CreateOrganizationextendsBaseClass {
	@Test(groups = {"smokeTest","RegressionTest"})
	public void createOrganization(WebDriver driver)  throws Throwable {
		

		Property_Utility plib=new Property_Utility();
		Javautility jlib=new Javautility();
		ExcelUtility elib=new ExcelUtility();
		HomePage home=new HomePage(driver);
	 //HomePage home=new HomePage(driver);
		OrganizationCreationpage1 org=new OrganizationCreationpage1(driver);
	home.clickOrganizationsLinkText();
		org.clickOrganizationCreateImage();
		int ranNum = jlib.getRandomNum();
		String Exceldata = elib.getExceldata(ranNum, ranNum, ranNum);
		
		
		//String Exceldata = elib.getExcelData("Organization", 0, 0)+ranNum;
		org.organizationNamesTextField(Exceldata);
		Thread.sleep(1000);
		org.saveButton();
		Thread.sleep(1000);
		String actData = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		//String actData = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		System.out.println(actData);
		if(actData.contains(Exceldata))
		{
			System.out.println("pass");
		}else
		{
			System.out.println("fail");
		}
		Thread.sleep(1000);
		//home.signoutLink(driver);

}
}
