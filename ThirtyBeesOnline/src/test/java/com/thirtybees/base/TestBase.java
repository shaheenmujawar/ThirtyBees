package com.thirtybees.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	public static WebDriver driver =null;
	Properties prop;
	public static Logger log = Logger.getLogger(TestBase.class);
	
	public  WebDriver initialization(String propertyfileName) throws Exception {
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/"+propertyfileName);		
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);

		if (browserName.equals("chrome")) {
			log.info("initializing browser");
			log.warn("chromedriver file should be at specific location");
			System.setProperty("webdriver.chrome.driver", "chromedriver1.exe");
			
			log.info("chrome browser opened");
			driver = new ChromeDriver();
		} 
		else if (browserName.equals("firefox")) {
			log.info("initializing browser");
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			log.info("mozilla firefox browser opened");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		return driver; 
	}




    public String getScreenshot(String name) {
	   TakesScreenshot ts = (TakesScreenshot)driver;
	  File src= ts.getScreenshotAs(OutputType.FILE);
	  File dest = new File(System.getProperty("user.dir")+"/screenshot/"+name+".jpg");
	  try {
		FileUtils.copyFile(src, dest);
	} catch (IOException e) {
		e.printStackTrace();
	}
	  return "screenshot captured";
	  
	   
}   
}
