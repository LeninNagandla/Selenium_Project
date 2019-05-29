package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyCoursesPOM {
	private WebDriver driver; 
	
	public MyCoursesPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='btn btn-default']")
	private WebElement addIntroductionIcon; 
	
	@FindBy(tagName="iframe")
	private WebElement iframeTextBox;
	
	@FindBy(xpath="//html[@dir='ltr']")
	private WebElement inputTextBox;
	
	@FindBy(xpath="//*[@id='cke_1_contents']//iframe")
	private WebElement frame1;
	
	@FindBy(id="introduction_text_intro_cmdUpdate")
	private WebElement saveBtn; 
	
	@FindBy(linkText="SeleniumA")
	private WebElement coursecreated;
	
	@FindBy(linkText="Course description")
	private WebElement coursedesc;
	
	@FindBy(xpath="//img[@title='Description']")
	private WebElement description;
	
	@FindBy(xpath="//input[@name='title' and @id='course_description_title']")
	private WebElement courseTitle;
	
	@FindBy(id="course_description_submit")
	private WebElement saveBtn2;
	
	@FindBy(linkText="Users")
	private WebElement usersicon;
	
	@FindBy(xpath="//input[@type='checkbox' and @value='78']")
	private WebElement checkBox;
	
	@FindBy(linkText="Unsubscribe")
	private WebElement unsubscribe;
	
	@FindBy(linkText="Course catalog")
	private WebElement courseCatalog;
	
	
	public void clickIconBtn() {
		this.addIntroductionIcon.click(); 
	}
	
	public void sendIframetextbox(String inputText) {
		
		//this.driver.switchTo().frame(this.driver.findElement(By.xpath("//*[@title='Rich Text Editor, intro_content']")));	
		
		driver.switchTo().frame(frame1);
		WebElement body = driver.switchTo().activeElement();
		body.sendKeys(inputText);
		driver.switchTo().defaultContent();
		
		//this.inputTextBox.click();		
		//this.inputTextBox.sendKeys(inputText);
		
	}
	
	public void clickSaveBtn() {
		this.saveBtn.click();
		
	}
	
	
	public void clickCourseCreated() {
		this.coursecreated.click(); 
	}
	
	public void clickCourseDescIcon() {
		this.coursedesc.click(); 
	}
	
	public void clickonDescIcon() {
		this.description.click(); 
	}
	
	public void sendTitleInputBox(String title) {
		this.courseTitle.clear();
		this.courseTitle.sendKeys(title);
	}
	public void clickSave2Btn() {
		this.saveBtn2.click();
		
	}
	
	public void clickUsersIcon() {
		this.usersicon.click();
		
	}
	
	public void clickCheckBox() {
		this.checkBox.click();
		
	}
	
	public void clickUnsubscribe() {
		this.unsubscribe.click();
		this.driver.switchTo().alert().accept();
		
	}
	
	public void clickCourseCataloglnk() {
		this.courseCatalog.click();
		
	}
	
	}
	

