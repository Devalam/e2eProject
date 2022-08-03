package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	private By practice = By.cssSelector("a[href='practice-project']");
	private By text = By.cssSelector("[class='pull-left'] h2");
	private By youtube= By.cssSelector("[class*='fa-youtube']");

	public WebElement Practice() {
		return driver.findElement(practice);
	}

	public WebElement Text() {
		return driver.findElement(text);
	}
	public WebElement getYoutube() {
		return driver.findElement(youtube);
	}


}
