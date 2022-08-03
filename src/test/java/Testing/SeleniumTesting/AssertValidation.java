package Testing.SeleniumTesting;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjectModel.LandingPage;
import pageObjectModel.PracticePage;
import resources.Base;

public class AssertValidation extends Base {

	public WebDriver driver;
	Logger log = LogManager.getLogger(AssertValidation.class.getName());

	@BeforeTest
	public void intialization() throws IOException {
		driver = intializeDriver();
		log.info("Broswer invoking");
		driver.get(prop.getProperty("url"));
		log.info("landed on the required page");

	}

	@Test
	public void basePageNavigation() throws IOException {

		LandingPage lp = new LandingPage(driver);
		lp.Practice().click();
		log.info("click option is done");
		PracticePage pp = new PracticePage(driver);
		Assert.assertTrue(pp.Tittle().isDisplayed());
		log.info("content is displayed ");

		Assert.assertEquals(pp.Tittle().getText(),
				"We will inform you through email if we launch any Practise Websites for Automation or if there are any new Topics added to your enrolled course.");

	}

	@AfterTest
	public void tearDown() {
		driver.close();
		log.info("AssertValidation class browser is closed");
	}

}
