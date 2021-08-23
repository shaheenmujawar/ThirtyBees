package com.thirtybees.objectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FooterRepository {
	
	@FindBy(xpath="//h2[@class='footer-title section-footer-title']")
	public WebElement footerTitle;
	
	@FindBy(id="newsletter-input")
	public WebElement user;
	
	@FindBy(xpath="//button[@name='submitNewsletter']")
	public WebElement button;
	
	@FindBy(xpath="//button[@name='submitNewsletter']")
	public WebElement alreadySubscribed;
	
	
	@FindBy(xpath="//h2[@class='footer-title title_block section-title-footer']")
	public WebElement subTitle;
	
	@FindBy(xpath="//a[@title='Specials']")
	public WebElement speacials;
	
	@FindBy(xpath="//a[@title='Specials']")
	public WebElement logo;
	
	@FindBy(xpath="//a[@title='Coffee and Tea']")
	public WebElement coffeeAndTea;
	
	@FindBy(xpath="//a[@title='Top sellers']")
	public WebElement topSellers;
	
	@FindBy(xpath="//a[@title='Top sellers']")
	 public List<WebElement> infoMenu;

}
