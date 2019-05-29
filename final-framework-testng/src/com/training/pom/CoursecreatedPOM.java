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
	
}
