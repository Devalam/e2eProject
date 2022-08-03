package Testing.SeleniumTesting;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjectModel.LandingPage;
import resources.Base;

public class validatingTitle extends Base {

	public WebDriver driver;

	Logger log = LogManager.getLogger(validatingTitle.class.getName());
	public LandingPage lp;

	@BeforeTest
	public void intialization() throws IOException {
		driver = intializeDriver();
		log.info("chrome browser intialized for valtitle class");
		driver.get(prop.getProperty("url"));

	}

	@Test
	public void titleValidation() {

		lp = new LandingPage(driver);
		System.out.println(lp.Text().isDisplayed());

		Assert.assertTrue(lp.Text().isDisplayed());
		Assert.assertEquals(lp.Text().getText(), "Featured Courses");

	}

	@Test
	public void logoValidation() {
		lp = new LandingPage(driver);
		Assert.assertTrue(lp.getYoutube().isDisplayed());
		System.out.println(lp.getYoutube().isDisplayed());
	}

	@AfterTest
	public void tearDown() {
		driver.close();

	}

}
