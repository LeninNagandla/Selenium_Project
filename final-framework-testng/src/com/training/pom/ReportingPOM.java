package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ReportingPOM {
	private WebDriver driver; 
	
	public ReportingPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}	
	
	@FindBy(linkText="Followed users")
	private WebElement followedusers;	
	
	public void clickFollowedUsersBtn() {
		this.followedusers.click(); 
	}
	
	@FindBy(xpath="//table/tbody/tr[4]/td[5]/a")
	private WebElement iconofthestudent;	
	
	public void clickIconoftheStudent() {
		this.iconofthestudent.click(); 
	}
	
	@FindBy(xpath="//table/tbody/tr[2]/td[5]/a")
	private WebElement iconofthestudent2;	
	
	public void clickIconoftheStudent2() {
		this.iconofthestudent2.click(); 
	}
	
	
	@FindBy(xpath="//table/tbody/tr[1]/td[7]/a")
	private WebElement iconofthecourse;	
	
	public void clickIconoftheCourse() {
		this.iconofthecourse.click(); 
	} 
	
	
	
	@FindBy(xpath="//table/tbody/tr[1]/td[5]/a")
	private WebElement quiziconLatestAttempt;	
	
	public void clickQuizIconTestSection() {
		this.quiziconLatestAttempt.click(); 
	} 
	
	@FindBy(name="send_notification")
	private WebElement sendEmailcheckbox;	
	
	public void clickSendEmailcheckbox() {
		this.sendEmailcheckbox.click(); 
	} 
	
	@FindBy(id="form-email_submit")
	private WebElement correctTestBtn;	
	
	public void clickCorrectTestBtn() {
		this.correctTestBtn.click(); 
	} 
	
	
	//@FindBy(xpath="//section/div/div[2][@class='alert alert-info']")
	
	@FindBy(xpath="//section/div/div[2]")
	private WebElement sentMessage;	
	
	public String messageSentText() {
		return this.sentMessage.getText();
	} 
	
	@FindBy(linkText="SeleniumA")
	private WebElement courseNamelink;	
	
	public void clickCourseNamelink() {
		this.courseNamelink.click();
	} 
	
		
	@FindBy(id="search_user_keyword")
	private WebElement keyword;	
	
	public void sendKeywordTextBox(String keyword) {
		this.keyword.sendKeys(keyword);
	} 
	
	
	@FindBy(id="search_user_submit")
	private WebElement searchUser;	
	
	public void clicksearchUserBtn() {
		this.searchUser.click();
	} 
	
	@FindBy(linkText="Followed teachers")
	
	private WebElement followedTeachers;
	
	public void clickfollowedTeachersLnk() {
		this.followedTeachers.click();
	} 
	
	
}
	


	

