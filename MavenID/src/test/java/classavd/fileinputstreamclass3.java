package classavd;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fileinputstreamclass3 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver();
		WebDriver driver =new EdgeDriver();
		FileInputStream fes=new FileInputStream("./Newfile");
		Properties pro=new Properties();
        pro.load(fes);
        String URL = pro.getProperty("url");
		String user= pro.getProperty("user");
		String password =pro.getProperty("password");
		driver.get(URL);
		driver.manage().window().maximize();
		driver.findElement(By.name("user_name")).sendKeys(user);
		driver.findElement(By.name("user_password")).sendKeys(password);
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr/td[12]/a")).click();
		driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[2]/td[2]/"
				+ "table/tbody/tr/td[2]/table/tbody/tr/td/table/tbody/tr/td[1]/a/img")).click();
		driver.findElement(By.xpath("/html/body/table[4]/tbody/tr/td[2]/form"
				+ "/div/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input")).sendKeys("sofa");
		driver.findElement(By.xpath("/html/body/table[4]/tbody/tr/td[2]/form/div/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td/div/input[1]")).click();
	
		
	}

}
