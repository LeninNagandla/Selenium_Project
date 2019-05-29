package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPOM {
	
private WebDriver driver; 
	
	public AdminPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	/*@FindBy(linkText="Add a user")
	private WebElement addauser; */
	
	@FindBy(xpath="//a[@href='user_add.php']")
	private WebElement addauser;
	
	public void clickAddauserlink() {
		Actions action = new Actions(this.driver);
		action.moveToElement(this.addauser).click().build().perform();
				
		//this.addauser.click(); 
	}

}
