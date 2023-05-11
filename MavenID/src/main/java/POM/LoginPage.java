package POM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
      
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="user_name")
	private WebElement username;
	
	@FindBy(name="user_password")
	private WebElement userpassword;
	
	@FindBy(id="submitButton")
	private WebElement submitbutton;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getUserpassword() {
		return userpassword;
	}

	public WebElement getSubmitbutton() {
		return submitbutton;
	}
	public void logintoadd(String name,String password) {
		username.sendKeys(name);
		userpassword.sendKeys(password);
		submitbutton.click();
	}
}
