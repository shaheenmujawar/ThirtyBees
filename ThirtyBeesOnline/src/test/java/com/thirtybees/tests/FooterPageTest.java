package com.thirtybees.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.thirtybees.base.TestBase;
import com.thirtybees.pages.FooterPage;

public class FooterPageTest extends TestBase {
	WebDriver driver;
	public FooterPage fp;
	private Object alreadySubscribed;
	
	@BeforeMethod
	public void setUp() {
	System.setProperty("webdriver.chrome.driver","chromedriver1.exe");
	  driver = new ChromeDriver();
	 driver.get("http://javabykiran.in/Other/thbees/");
	 driver.manage().window().maximize();
	 fp = new FooterPage(driver);
	}
	
	@AfterMethod
	 public void closeSetup() {
	 driver.close();
}  
	
	@Test
	public void verifyfooterTitle() throws Exception {
		Assert.assertTrue(fp.verifyFooterTitle());
	}
	
	@Test
	public void validEmailIdIntoNewsLetter() {
		Assert.assertEquals(fp.ValidEmailIdIntoNewsLetter(),true);
	}
	
	@Test
	public void verifySubTitle() {
		Assert.assertTrue(fp.SubTitle());
		
	}
	
	@Test
	public void verifySpeacials() {
		Assert.assertEquals(fp.verifySpeacials(), true);
	}
	
	@Test
	public void verifyLogo() {
		Assert.assertTrue(fp.verifyLogo());
	}
	
	
	
	
	
	

}
