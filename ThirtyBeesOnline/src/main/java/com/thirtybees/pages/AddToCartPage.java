package com.thirtybees.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AddToCartPage {
	WebDriver driver;
	@Test
	public void addToCart() {
		System.setProperty("webdriver.chrome.driver","chromedriver1.exe");
		driver=new ChromeDriver();
		driver.get("http://javabykiran.in/Other/thbees/");
		driver.manage().window().maximize();
		driver.findElement(By.id("search_query_top")).clear();
		driver.findElement(By.id("search_query_top")).sendKeys("candle");
		driver.findElement(By.xpath("//*[@id=\"searchbox\"]/div/span/button/i")).click();
	String text=driver.findElement(By.xpath("//img[@title='Candle']")).getText();
	if(text.contains("candle")) {
		driver.findElement(By.xpath("//img[@title='Candle']")).click();
		}else {
			System.out.println("There is not Candle found ");
		}
		
	}
//	WebDriverWait wait = new WebDriverWait(driver, 30);
//
//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(sBookName))).click();
//
//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(sAddToCart))).click();
//
//	getElement(By.xpath(sViewCartXPath)).click();
//	getElement(By.cssSelector("form[id='view-cart-form'] button")).click();
//	getElement(By.xpath("//input[@id='email' and @name='email']")).sendKeys("test@testmail.com");
//
//	// pause for a second and close the browser.
//	Thread.sleep(1000);
//	endSession();
//}
//
//public static WebElement getElement(final By locator) {
//	FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS)
//			.pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
//
//	WebElement element = wait.until(new Function<WebDriver, WebElement>() {
//
//		@Override
//		public WebElement apply(WebDriver arg0) {
//			return arg0.findElement(locator);
//		}
//
//	});
//
//	return element;
//}
//
//public static void flipkartLogin() {
//	driver.findElement(By.linkText("Log In")).click();
//
//	// TBD: Fill your username/password of flipkart.
//	getElement(By.cssSelector("input[placeholder='Enter email/mobile']")).sendKeys("");
//	getElement(By.cssSelector("input[placeholder='Enter password']")).sendKeys("");
//	getElement(By.cssSelector("input[value='Login'][class='submit-btn login-btn btn']")).click();
//
//	try {
//		Thread.sleep(1000);
//	} catch (InterruptedException e) {
//		// TBD: Auto-generated catch block.
//		e.printStackTrace();
//	}
//}
//
//public static void endSession() {
//	driver.close();
//	driver.quit();
//}
//}

}
