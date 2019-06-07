package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserEditProfilePOM {
	
private WebDriver driver; 
	
	public UserEditProfilePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	/*@FindBy(linkText="Add a user")
	private WebElement addauser; */
	
	@FindBy(id="profile_password0")
	private WebElement profilepwdold;
	
	public void sendprofilepwdold(String oldpassword) {
		this.profilepwdold.sendKeys(oldpassword);
				
	}
	
	@FindBy(id="password1")
	private WebElement profilepwdnew;
	
	public void sendprofilepwdNew(String newpassword) {
		this.profilepwdnew.sendKeys(newpassword);
				
	}
	
	@FindBy(id="profile_password2")
	private WebElement confirmpwd;
	
	public void sendprofileconfirmpwd(String confirmpassword) {
		this.confirmpwd.sendKeys(confirmpassword);
				
	}
	
	@FindBy(id="profile_apply_change")
	private WebElement savesettings;
	
	public void clickSavePwd() {
	
		this.savesettings.click();
	}

}
