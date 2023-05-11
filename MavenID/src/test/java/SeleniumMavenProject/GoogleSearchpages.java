package SeleniumMavenProject;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchpages {
	private static WebElement element = null;
	
	public static WebElement textbox_search(WebDriver driver) throws Throwable {
 element = driver.findElement(By.name("q"));
 Thread.sleep(3000);
return element;


}
	public static WebElement button_search(WebDriver driver) throws Throwable {
		Thread.sleep(3000);
		element = driver.findElement(By.name("btnK"));
		return element;
	}
}
