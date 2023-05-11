package classavd;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class class1 {

	private static WorkbookFactory workWorkbookFactory;

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.edgedriver();
		WebDriver driver =new EdgeDriver();
		FileInputStream fes=new FileInputStream("./Newfile");
		Properties pro=new Properties();
		pro.load(fes);
		
		String URL = pro.getProperty("url");
		String user= pro.getProperty("user");
		String password =pro.getProperty("password");
		
		
		driver.get(URL);
		driver.findElement(By.xpath("//*[@id='form']/div/div[2]/input"))
		.sendKeys(pro.getProperty("user"));
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div[4]/input"))
		.sendKeys(pro.getProperty("password"));
		driver.findElement(By.xpath("//*[@id='submitButton']")).click();
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr/td[6]/a")).click();
		driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[2]/td[2]/table/tbody/tr/td[2]/table/tbody/tr/td/table/tbody/tr/td[1]/a/img")).click();
		Random ran=new Random();
		int rannum= ran.nextInt(90);
		FileInputStream fes1=new FileInputStream("./Eclipse excel.xlsx");
		
		 Workbook book = WorkbookFactory.create(fes1);
		 Sheet sheet = book.getSheet("sheet1");
		 Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		String output = cell.getStringCellValue()+rannum;
		
		driver.findElement(By.xpath("/html/body/table[4]/tbody/tr/td[2]/div/form/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input"))
		.sendKeys(output);
		driver.findElement(By.xpath("/html/body/table[4]/tbody/tr/td[2]/div/form/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td/div/input[1]")).click();
		
		
	
	 	 
	 
		
	}

}
