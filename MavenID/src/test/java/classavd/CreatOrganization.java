package classavd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CreatOrganization {

	public static void main(String[] args) throws Throwable {
	
String key="webdriver.edge.driver";
String Value="./src/main/resource/chromedriver.exe";
System.setProperty(key, Value);
WebDriver driver=new EdgeDriver();
Property_Utility pro=new Property_Utility();
String BROWSER = pro.getKeyValue(driver);

  
	}

}
