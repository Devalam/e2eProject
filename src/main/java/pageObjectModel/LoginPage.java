package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage( WebDriver driver) {
		this.driver=driver;
	}
	
	private By email =By.cssSelector("[name='email']");
	
	public WebElement getEmail() {
		return driver.findElement(email);
	}

}
