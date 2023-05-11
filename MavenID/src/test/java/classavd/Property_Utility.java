package classavd;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class Property_Utility {
	
	public  String getKeyValue(WebDriver driver) throws Throwable
	{
		FileInputStream fis=new FileInputStream("./Newfile");
		Properties pro=new Properties();
		pro.load(fis);
		String value = pro.getProperty("url");
		return value;
	}


}