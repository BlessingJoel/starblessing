package classavd;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class productdeleted {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        
        FileInputStream file=new FileInputStream("./Newfile");
        Properties pro=new Properties();
        pro.load(file);
        
        String URL = pro.getProperty("url");
        
        driver.get(URL);
        
        driver.findElement(By.name("user_name")).sendKeys(pro.getProperty("user"),Keys.TAB,pro.getProperty("password")
        		,Keys.TAB.ENTER);
        driver.findElement(By.linkText("Products")).click();
        driver.findElement(By.xpath("//*[@title='Create Product...']")).click();
        
//        Random ran=new Random();
//        int r = ran.nextInt(88);
        GenericUtility gu=new GenericUtility();
        int gran = gu.getran();
        FileInputStream file1= new FileInputStream("./src/test/resources/excel2.xlsx");
        Workbook book = WorkbookFactory.create(file1);
        Sheet sheet = book.getSheetAt(0);
        Row row = sheet.getRow(1);
        Cell cell = row.getCell(0);
        String output = cell.getStringCellValue()+gran;
        driver.findElement(By.name("productname")).sendKeys(output);
        driver.findElement(By.name("button")).click();
        driver.findElement(By.linkText("Products")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("selected_id")).click();
        driver.findElement(By.xpath("//*[@id='massdelete']/table/tbody/tr[1]"
        		+ "/td/table[2]/tbody/tr/td/input[1]")).click();
        
		Alert alt=driver.switchTo().alert();
		alt.accept();
        
	}

}
