package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticePage {

	public WebDriver driver;

	public PracticePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	private By name = By.cssSelector("[id='name']");
	private By email = By.cssSelector("[id='email']");
	private By tittle = By.cssSelector("div label");

	public WebElement Name() {
		return driver.findElement(name);
	}

	public WebElement Email() {
		return driver.findElement(email);
	}

	public WebElement Tittle() {
		// TODO Auto-generated method stub
		return driver.findElement(tittle);
	}

}
