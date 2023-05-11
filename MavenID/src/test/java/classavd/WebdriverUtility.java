package classavd;

import java.sql.Driver;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class WebdriverUtility {
	public void getWindowMax(WebDriver driver) {
		driver.manage().window().maximize();
	}
	public void getImplicityWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	public void getPageLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public void getSwitchtowindows(WebDriver driver) {
		Set<String> newwid = driver.getWindowHandles();
		Iterator<String> id = newwid.iterator();
		while(id.hasNext()) {
			String wid = id.next();
			driver.switchTo().window(wid);
		}
	}
	
	public void getSwitchtoAlertAccept(WebDriver driver) {
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}
	public void getSwitchtoAlertDismiss(WebDriver driver) {
		Alert alt = driver.switchTo().alert();
		alt.dismiss();
	}
	public void getSwitchtoFrame(WebDriver driver) {
		 driver.switchTo().frame(0);
	}
	public void getScrollUp(WebDriver driver) {
	
		JavascriptExecutor ext=(JavascriptExecutor)driver;
		ext.executeAsyncScript("window.scroll(0,-234)", "");
	}
	
		
	
	public void getScrollDown(WebDriver driver) {
		JavascriptExecutor ext=(JavascriptExecutor)driver;
		ext.executeScript("window.scroll(0,document.body.scrollHeight)", "");

	}
	
		}
