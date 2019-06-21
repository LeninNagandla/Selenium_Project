package com.training.pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPOM {
	private WebDriver driver; 
	
	public LogoutPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//div[@id=\"navbar\"]/ul[2]/li[2]/a/img")
	private WebElement userprofileicon; 
	
	public void clickonUserProfileIcon() {		
		Actions action = new Actions(this.driver);
		action.moveToElement(userprofileicon).click().build().perform();		
				
	}
	
	@FindBy(xpath="//a[@id='logout_button']")
	private WebElement logout;
	public void clickonLogout() {		
		this.logout.click();		
				
	}
	
	
	
	
	
	
	
	
	
}
