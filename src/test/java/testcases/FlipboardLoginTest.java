package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import screens.ChooseTopicsScreen;
import screens.LoginScreen;
import utilities.AppiumServer;

public class FlipboardLoginTest extends TestBase {
	
	LoginScreen login;
	ChooseTopicsScreen  topicScreen;
	
	@BeforeTest
	public void init() {
		setUp();
		login = new LoginScreen(driver);
		topicScreen = new ChooseTopicsScreen(driver);
	}
	
	@Test(priority=1)
	public void validateGetStartedButton() {
		
		login.clickGetStartedBtn();
		// Assert.fail("Failing Test case to check screenshot and reporting");
	}

	@Test(priority=2)
	public void chooseTopicsTest() {
		
		topicScreen.chooseTopics(4).clickContinue();
		//Assert.fail("Failing Test case to check screenshot and reporting");
		
	}
	
	@AfterTest
	public void quitDriver() {
		
		quit();
	}

}
