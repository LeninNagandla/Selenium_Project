package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CoursecreatedPOM {
	private WebDriver driver; 
	
	public CoursecreatedPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Create a course")
	private WebElement createNewCourse; 
	
	@FindBy(id="title")
	private WebElement courseDesc;
	
	@FindBy(id="advanced_params")
	private WebElement advanSettings; 
	
	@FindBy(xpath="//button[@data-id='add_course_category_code']")
	private WebElement categorylistbox;	
	
	@FindBy(xpath="//button[@data-id='update_course_category_code']")
	private WebElement admincategorylistbox;	
	
	//button[@data-id='update_course_category_code']
	
	@FindBy(xpath="//span[contains(text(),'Projects (PROJ)')]")
	private WebElement selectProjects;
	
	@FindBy(id="add_course_wanted_code")
	private WebElement courseCode;
	
	@FindBy(xpath="//button[@data-id='add_course_course_language']")
	private WebElement langListBox;
	
	@FindBy(xpath="//li[@data-original-index='5']//span[contains(text(),'English')]")
	private WebElement Englangselect;
	
	@FindBy(id="add_course_submit")
	private WebElement addCoursebtn;
	
	@FindBy(id="update_course_title")
	private WebElement adminCreateCourseTitle;
	
	@FindBy(id="visual_code")
	private WebElement adminCreateCourseCode;
	
	//@FindBy(xpath="//span[@aria-owns='select2-course_teachers-results']")	
	//@FindBy(xpath="//select[@id='course_teachers']")
	
	@FindBy(xpath="//ul[@class='select2-selection__rendered']")
	private WebElement courseTeachers;
	
	@FindBy(xpath="//*[contains(text(),'Lenin3')]")
	private WebElement lenin3Teacher;
	
	@FindBy(xpath="//button[@data-id='update_course_course_language']")
	private WebElement language;
	
	@FindBy(id="update_course_submit")
	private WebElement adminCourseCreatebtn;
	
	
	
	public void clkonCreateacourse() {
		this.createNewCourse.click();
		}
	
	public void courseName(String courseDesc) {
		this.courseDesc.clear(); 
		this.courseDesc.sendKeys(courseDesc); 
	}
	
	public void clkonAdvanSettings() {
		this.advanSettings.click();		
	}
	
		public void dropdownSelectCategory() {
			Actions action = new Actions(this.driver);
			action.moveToElement(categorylistbox).click().build().perform();
			action.sendKeys("Projects (PROJ)").build().perform();
			action.sendKeys(categorylistbox, Keys.ARROW_DOWN);
			action.moveToElement(selectProjects).click().build().perform();
			
		}
		public void dropdownSelectLang() {
			Actions action = new Actions(this.driver);
			action.moveToElement(langListBox).click().build().perform();
			action.sendKeys("English").build().perform();
			action.sendKeys(langListBox, Keys.ARROW_DOWN);
			action.moveToElement(Englangselect).click().build().perform();
			
		}
		public void clickCreateCourseBtn() {
			this.addCoursebtn.click();
		}
		
		public void sendAdminCreateCourseTitle(String title) {
			this.adminCreateCourseTitle.clear();
			this.adminCreateCourseTitle.sendKeys(title);
		}
		
		public void sendAdminCreateCourseCode(String code) {
			this.adminCreateCourseCode.clear();
			this.adminCreateCourseCode.sendKeys(code);
		}
		
		public void clickandSendCourseTeachers() {
			Actions action = new Actions(this.driver);
			action.moveToElement(courseTeachers).click().build().perform();
			action.sendKeys("Lenin").build().perform();
			action.moveToElement(lenin3Teacher).click().build().perform();
		}
		
		public void dropdownAdminCategory() {
			Actions action = new Actions(this.driver);
			action.moveToElement(admincategorylistbox).click().build().perform();
			action.sendKeys("Projects (PROJ)").build().perform();
			//action.sendKeys(categorylistbox, Keys.ARROW_DOWN);
			action.moveToElement(selectProjects).click().build().perform();
			
		}
		
		public void dropdownAdminLang() {
			Actions action = new Actions(this.driver);
			action.moveToElement(language).click().build().perform();
			action.sendKeys("English").build().perform();
			action.moveToElement(Englangselect).click().build().perform();
			
		}
		
		public void clickAdminCreateCourseBtn() {
			this.adminCourseCreatebtn.click();
		}
		
		
	
}
