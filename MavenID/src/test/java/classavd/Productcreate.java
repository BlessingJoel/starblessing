package classavd;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Productcreate {

	public static void main(String[] args) throws Exception {
		  WebDriverManager.chromedriver();
		  WebDriver driver=new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			//FileInputStream fis=new FileInputStream("./src/test/resources/commondatafile.properties");
			FileInputStream fis=new FileInputStream("./Newfile");
	        Properties pro=new Properties();
	        pro.load(fis);
	        
	        
			String URL = pro.getProperty("url");
			String user = pro.getProperty("user");
			String password = pro.getProperty("password");
			
			driver.get(URL);
			driver.manage().window().maximize();
			driver.findElement(By.name("user_name")).sendKeys(user);
			driver.findElement(By.name("user_password")).sendKeys(password);
			driver.findElement(By.id("submitButton")).click();
			
			driver.findElement(By.linkText("Products")).click();
			driver.findElement(By.xpath("//img[@alt='Create Product...']")).click();
			
			//Random ran=new Random();
			//int ranNum1 = ran.nextInt(1000);
			GenericUtility gu=new GenericUtility();
			int ran = gu.getran();
			
			FileInputStream fes=new FileInputStream("./Eclipse excel.xlsx");
			Workbook book = WorkbookFactory.create(fes);
			 Sheet sheet = book.getSheetAt(0);
			Row row = sheet.getRow(3);
			Cell cel = row.getCell(0);
			String productName = cel.getStringCellValue()+ran;
			
			driver.findElement(By.name("productname")).sendKeys(productName);
			driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();

	}

}
