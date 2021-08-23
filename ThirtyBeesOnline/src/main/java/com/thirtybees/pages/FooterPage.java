package com.thirtybees.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.TestNG;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.thirtybees.objectRepository.FooterRepository;

public class FooterPage  extends FooterRepository {
	WebDriver driver;
	
	public FooterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public boolean verifyFooterTitle() throws Exception {
		String title= footerTitle.getText();
		return true;
		}
	
	public boolean ValidEmailIdIntoNewsLetter() {
		user.sendKeys("testuser@bee.com");
		button.click();
		String str=alreadySubscribed.getText();
		return true;
		}
	
	public boolean SubTitle() {
		String title=subTitle.getText();
		return true;
		
	}
	
	public boolean verifySpeacials() {
		speacials.click();
		String expUrl=driver.getCurrentUrl();
		return true;
	}
	
	public boolean verifyLogo() {
		boolean img = logo.isDisplayed();
	    return img;
	}
	
	
	public void verifyClickProductMug() {
		//driver.get("http://javabykiran.in/Other/thbees/");
		driver.findElement(By.xpath("//a[@title='Top sellers']")).click();
		 String mainWindow = driver.getWindowHandle();
		 Set<String> windows = driver.getWindowHandles();
		 for(String ChildWin : windows) {
			 if(!ChildWin.equals(mainWindow)) {
				 driver.switchTo().window(ChildWin);
				 if(driver.getCurrentUrl().contains("Top sellers"))
					 driver.close();
			 }
		 }
		}
	
	
	@Test
	public void CheckSequenceOfMenu() throws Exception {
		ArrayList<String> expData = new ArrayList<String>();
		DataFormatter df = new DataFormatter();
			FileInputStream fis = new FileInputStream("Info.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheet("footer_Info");
			int rows = sheet.getLastRowNum();
			for(int i=1;i<=rows;i++){
				int col = sheet.getRow(i).getLastCellNum();
				for(int j=0;j<= col;j++)
				{
					Cell cell = sheet.getRow(i).getCell(j);
					String value = df.formatCellValue(cell);
					expData.add(value);
					System.out.println(value+" ");
				}
				System.out.println();
				
				
			}
			
			
		}
	}
		
	
	


