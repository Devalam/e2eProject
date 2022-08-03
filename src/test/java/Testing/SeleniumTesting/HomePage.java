package Testing.SeleniumTesting;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjectModel.LandingPage;
import pageObjectModel.PracticePage;
import resources.Base;

public class HomePage extends Base {
	
	public WebDriver driver;
	Logger log = LogManager.getLogger(HomePage.class.getName());
	
	
	@BeforeTest
	public void intialization() throws IOException {
		driver = intializeDriver();
		log.info("chrome browser intialized");
		
		
	}

	@Test(dataProvider="getData")
	public void basePageNavigation(String name, String email) throws IOException {

		
		driver.get(prop.getProperty("url"));
		

		LandingPage lp = new LandingPage(driver);
		lp.Practice().click();
	
		
		PracticePage pp = new PracticePage(driver);
		pp.Name().sendKeys(name);
		pp.Email().sendKeys(email);
		log.info("entered the credentials");
		Assert.assertEquals(pp.Tittle().getText(),
				"We will inform you through email if we launch any Practise Websites for Automation or if there are any new Topics added to your enrolled course.");
		
		log.info("context is displayed");
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[2][2];
		data[0][0]="Naveen kumar";
		data[0][1]="naveen@gamil.com";
		data[1][0]="devalam";
		data[1][1]="devalam@gamil.com";
		return data;
		
				
				
				
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
		log.info("home page class browser is closed");
		log.info("Test Completed");
		
	}
	
	
	
	
	
	
}
