package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CourseCatalogPOM {
	
private WebDriver driver; 
	
	public CourseCatalogPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	/*@FindBy(linkText="Add a user")
	private WebElement addauser; */
	
	@FindBy(name="search_term")
	private WebElement searchInput;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement searchSubmit;
	
	@FindBy(xpath="//a//em[@class='fa fa-check']")
	private WebElement subscribe;
	
	public void clickCourseCatalogSearch(String searchterm) {
		this.searchInput.clear();
		this.searchInput.sendKeys(searchterm);		
				
		
	}
	public void clickOnSearch() {
		this.searchSubmit.click();				
		 
	}
	
	public void clickOnSubscribe(){
		this.subscribe.click();		
		 
	}
}
