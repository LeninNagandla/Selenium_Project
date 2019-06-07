package com.training.pom;



import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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
	
	@FindBy(linkText="Course list")
	private WebElement courseList;
	
	@FindBy(xpath="//tr[6]/td[8]/a[6]")
	private WebElement courseDelete;
	
	@FindBy(linkText="Create a course")
	private WebElement adminCreateCourse;
	
	@FindBy(linkText="Add users to course")
	private WebElement adminAddUsersToCourse;
	
	@FindBy(name="UserList[]")
	private WebElement userList;
	
	@FindBy(name="CourseList[]")
	private WebElement allcourseList;			
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement addTheCourse;
	
	public void clickAddauserlink() {
		Actions action = new Actions(this.driver);
		action.moveToElement(this.addauser).click().build().perform();
				
		//this.addauser.click(); 
	}
	
	public void clickCourseListlink() {
				
		this.courseList.click(); 
	}
	
	public void clickCourseDeleteicon() {
		
		this.courseDelete.click(); 
		this.driver.switchTo().alert().accept();
	}
	
	public void clickAdminCreateCourselink() {
		
		this.adminCreateCourse.click(); 
	}
	public void clickAddUsersToCourse() {
		this.adminAddUsersToCourse.click();
	}
	
	public void selectUserlist() {
		Select userlist = new Select(this.userList);		
		userlist.selectByVisibleText("Nagandla4 Lenin4 (LeninNagandla4)");		
		/*
		 * List<WebElement> alluserlist = userlist.getOptions();
	String username1 = "Nagandla3 Lenin3 (LeninNagandla3)";
		for (int i = 0; i < alluserlist.size(); i++) {
			String username = alluserlist.get(i).getText();
			if (username.equalsIgnoreCase(username1)) {
				
			}
					
			
		}*/
	}
	
	public void selectCourselist() {
		Select courselistall = new Select(this.allcourseList);		
		courselistall.selectByVisibleText("(JAVA2) java2");		
		
	}
	
	public void clickAddtheCoursebtn() {
		
		this.addTheCourse.click(); 
	}
	
	@FindBy(linkText="Courses categories")
	WebElement adminCoursesCategories;
    public void clickAdminCoursesCategorieslnk() {
		
		this.adminCoursesCategories.click(); 
	}
    @FindBy(xpath="//img[@title='Add category']")
    WebElement AdminAddcategory;
    
      public void clickAddCategoryicon() {
		
		this.AdminAddcategory.click(); 
	}
      @FindBy(id="course_category_code")
      WebElement coursecategorycode;
      public void sendCategoryCode(String categorycode) {
    	  	
  		this.coursecategorycode.clear();
  		this.coursecategorycode.sendKeys(categorycode);
  	}
      @FindBy(id="course_category_name")
      WebElement coursecategoryname;
      public void sendCategoryName(String categoryname) {
    	  	
  		this.coursecategoryname.clear();
  		this.coursecategoryname.sendKeys(categoryname);
  	}
      
      @FindBy(id="course_category_submit")
      WebElement submitcoursecategory;
      
      public void clickAddCategorybtn() {  		
  		this.submitcoursecategory.click(); 
  	}
      @FindBy(linkText="Courses categories")
      WebElement coursesCategories;
      public void clickcoursesCategorieslnk() {  		
    		this.coursesCategories.click(); 
    	}
      
      @FindBy(xpath="//table/tbody/tr[9]/td[4]/a[3]")
      WebElement deletecategory;
      public void deleteCategoryicon() {  		
  		this.deletecategory.click();
      }
      
}
