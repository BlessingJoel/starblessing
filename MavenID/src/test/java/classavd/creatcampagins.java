package classavd;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import POM.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class creatcampagins {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver =new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
		
		String old = driver.getWindowHandle();
		FileInputStream fes=new FileInputStream("./Newfile");
		Properties pro=new Properties();
		pro.load(fes);

		String url = pro.getProperty("url");
		String user= pro.getProperty("user");
		String password =pro.getProperty("password");
		driver.get(url);
		LoginPage log=new LoginPage(driver);
		log.logintoadd(user, password)
		
//		driver.findElement(By.name("user_name")).sendKeys(user);
//		driver.findElement(By.name("user_password")).sendKeys(password);
//		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.linkText("More")).click();
		driver.findElement(By.linkText("Campaigns")).click();
		driver.findElement(By.xpath("//img[@title='Create Campaign...']")).click();

		Random ran=new Random();
		int RanNum = ran.nextInt(1000);

		FileInputStream fes1=new FileInputStream("./Eclipse excel.xlsx");
		Workbook book = WorkbookFactory.create(fes1);

		org.apache.poi.ss.usermodel.Sheet sheet1 = book.getSheet("sheet1");
		Row row = sheet1.getRow(3);
		Cell cell = row.getCell(0);
		String output = cell.getStringCellValue()+RanNum;
	driver.findElement(By.xpath("/html/body/table[4]/tbody/tr/td[2]/div/form/table/tbody/tr[2]/td/table/tbody/tr/td/table/"
			+ "tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input")).sendKeys(output);
	driver.findElement(By.xpath("/html/body/table[4]/tbody/tr/td[2]/div/form/table/tbody/tr[2]/td/table"
			+ "/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[5]/td[4]/img")).click();
	
	Set<String> first = driver.getWindowHandles();
	
	Iterator<String> id = first.iterator();
	while(id.hasNext()) {
		String wid = id.next();
		driver.switchTo().window(wid);
		}
	FileInputStream file1 = new FileInputStream("./Eclipse excel.xlsx");
			Workbook book1 = WorkbookFactory.create(file1);

org.apache.poi.ss.usermodel.Sheet sheet11 = book1.getSheet("sheet1");
	Row row1 = sheet11.getRow(3);
	Cell cell1 = row1.getCell(0);
	String output1 = cell1.getStringCellValue();
			
	
		driver.findElement(By.xpath("//*[@id='search_txt']")).sendKeys("sofa");
		
		driver.findElement(By.name("search")).click();
		driver.findElement(By.xpath("(//*[text()='sofa'])[2]")).click();
		
		driver.switchTo().window(old);
		driver.findElement(By.name("button")).click();
		
//		if(){
//			System.out.println("pass");
//		}
//		else
//		{
//			System.out.println("fail");
//		}
		WebElement data = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		Actions act=new Actions(driver);
		act.moveToElement(data).perform();
		driver.findElement(By.linkText("Sign Out")).click();

	}
	
	}
