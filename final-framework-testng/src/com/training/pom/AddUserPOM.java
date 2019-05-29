package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddUserPOM {
	private WebDriver driver; 
	
	public AddUserPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="firstname")
	private WebElement firstName; 
	
	@FindBy(id="lastname")
	private WebElement lastName;
	
	@FindBy(id="email")
	private WebElement emailUser; 
	
	@FindBy(id="username")
	private WebElement tuserName; 
	
	@FindBy(xpath="//input[@type='radio' and @value='0']")
	private WebElement tradio;
	
	@FindBy(id="password")
	private WebElement tpassword;
	
	/*@FindBy(xpath="//span[@class='bs-caret']")
	private WebElement clickselectprobtn;*/
	
	//button[@role='button']	
	@FindBy(xpath="//*[@data-id='status_select']")
	private WebElement dpdownselectprobtn;
	@FindBy(xpath="//span[contains(text(),'Trainer')]")
	private WebElement dpdownselecttrainer;
	
	
	@FindBy(xpath="//button[@data-id='user_add_language']")
	private WebElement dpdownselectlanbtn;
	
	/*@FindBy(xpath="//span[contains(text(),'Italiano')]")
	private WebElement dpdownselectlaneng;*/
	@FindBy(xpath="//span[contains(text(),'English')]")
	private WebElement dpdownselectlaneng;
	
	@FindBy(name="submit")
	private WebElement submit;
	
	public void sendFirstName(String firstName) {
		this.firstName.clear();
		this.firstName.sendKeys(firstName);
	}
	
	public void sendLastName(String lastName) {
		this.lastName.clear(); 
		this.lastName.sendKeys(lastName); 
	}
	
	public void sendEmail(String emailUser) {
		this.emailUser.clear(); 
		this.emailUser.sendKeys(emailUser); 
	}
	public void sendTuserName(String tuserName) {
		this.tuserName.clear();
		this.tuserName.sendKeys(tuserName);
	}
	
		public void clickradioBtn() {
		this.tradio.click(); 
	}
		public void sendTpassword(String tpassword) {
			this.tpassword.clear(); 
			this.tpassword.sendKeys(tpassword); 
		}
		public void dropdownSelectPro() {
			//this.dpdownselectprobtn.click();
			Actions action = new Actions(this.driver);
			action.moveToElement(dpdownselectprobtn).click().build().perform();
			action.sendKeys("Learner").build().perform();
			action.sendKeys(dpdownselectprobtn, Keys.ARROW_DOWN);
			//action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Trainer')]"))).click().build().perform();
			action.moveToElement(dpdownselecttrainer).click().build().perform();
			
		}
		public void dropdownSelectLan() {
			//this.dpdownselectlanbtn.click();
			//Select langlist = new Select(this.dpdownselectlanbtn);
			//langlist.selectByIndex(5);
			Actions action = new Actions(this.driver);
			action.moveToElement(dpdownselectlanbtn).click().build().perform();
			//action.sendKeys("Italiano").build().perform();
			action.sendKeys("English").build().perform();
			action.sendKeys(dpdownselectlanbtn, Keys.ARROW_DOWN);
			action.moveToElement(dpdownselectlaneng).click().build().perform();
			
			
			//Actions action = new Actions(this.driver);
			//action.moveToElement(dpdownselectlanbtn).click().build().perform();
			
		
			
			
		}
		public void clickSubmitBtn() {
			this.submit.click();
		}
	
}
