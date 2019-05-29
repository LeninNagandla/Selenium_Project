package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserMyCourcesPOM {
	
private WebDriver driver; 
	
	public UserMyCourcesPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	/*@FindBy(linkText="Add a user")
	private WebElement addauser; */
	
	@FindBy(linkText="Course catalog")
	private WebElement addauser;
	
	public void clickCourseCatalogBtn() {
		this.addauser.click();
				
		//this.addauser.click(); 
	}

}
