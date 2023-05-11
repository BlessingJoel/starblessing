package classavd;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver();
		WebDriver driver= new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		FileInputStream fis=new FileInputStream("./Newfile");
		Properties pro=new Properties();
		pro.load(fis);



		String URL = pro.getProperty("url");
		driver.get(URL);
		String user = pro.getProperty("username");
		String password = pro.getProperty("password");



		driver.findElement(By.name("user_name")).sendKeys("admin",Keys.TAB,"admin",Keys.ENTER.TAB) ;
		driver.findElement(By.id("submitButton")).click();


		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();

		Random ran=new Random();
		int RanNum = ran.nextInt(1000);

		FileInputStream fes=new FileInputStream("./src/test/resources/excel2.xlsx");
		Workbook book = WorkbookFactory.create(fes);
		Sheet sheet = book.getSheetAt(0);
		Row row = sheet.getRow(1);
		Cell cel = row.getCell(0);
		String excelData = cel.getStringCellValue()+RanNum;

		driver.findElement(By.name("lastname")).sendKeys(excelData);
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		String actData = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		
		if(actData.contains(excelData))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("Fail");
		}
//		WebElement data = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
//		Actions act= new Actions(driver);
//			act.moveToElement(data).perform();
//			driver.findElement(By.linkText("Sign Out")).click();
	}

}
