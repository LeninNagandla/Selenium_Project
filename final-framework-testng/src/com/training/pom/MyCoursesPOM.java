package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MyCoursesPOM {
	private WebDriver driver; 
	
	public MyCoursesPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="My courses")
	private WebElement mycourses;
	
	public void mycoursesLnk() {
		this.mycourses.click(); 
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
	
	@FindBy(linkText="Tests")
	private WebElement tests;
	
	public void clickonTestsicon() {
		this.tests.click();
	
	}
	
	@FindBy(xpath="//img[@title='Create a new test']")
	private WebElement createnewtest;
	
	public void clickonCreateNewTestBtn() {
		this.createnewtest.click();
	
	}
	
	@FindBy(id="exercise_title")
	private WebElement testName;
	
	public void sendTestName(String testname) {
		this.testName.sendKeys(testname);
}
	@FindBy(id="advanced_params")
	private WebElement advanSettings;
	
	public void clickAdvanSettings() {
		this.advanSettings.click();
	
	}
	
	@FindBy(name="activate_start_date_check")
	private WebElement enableStartDate;
	
	public void clickEnableStartDateRadioBtn() {
		this.enableStartDate.click();
	
	}
	
	@FindBy(xpath="//div[@id=\"start_date_div\"]//span[@class=\"input-group-addon cursor-pointer\"]")
	private WebElement date;
	
	@FindBy(xpath="//select[@class='ui-datepicker-month']")
	private WebElement selectmonth;
	
	@FindBy(xpath="//select[@class='ui-datepicker-year']")
	private WebElement selectyear;
	
	//@FindBy(xpath="//table[@class=\"ui-datepicker-calendar\"]//tbody/tr[2]/td[3]")
	@FindBy(xpath="//table//tbody/tr[4]/td[4]")
	private WebElement selectday;
	
	//div/dl/dd[2]/div/span  //xpath to select hour
	
	@FindBy(xpath="//div/dl/dd[2]/div/span")
	private WebElement hour;
	
	@FindBy(xpath="//div/button[2]")
	private WebElement doneBtn;
	
	public void clickonDate() {
		this.date.click();
		Select month = new Select(this.selectmonth);
		month.selectByVisibleText("Jun");		
		Select year = new Select(this.selectyear);
		year.selectByVisibleText("2019");
		this.selectday.click();
		Actions action = new Actions(this.driver);
		action.moveToElement(hour).build().perform();
		action.sendKeys(hour, Keys.ARROW_LEFT).build().perform();
		action.sendKeys(hour, Keys.ARROW_LEFT).build().perform();
		//this.doneBtn.click();	
		
		
	}
	
	@FindBy(id="pass_percentage")
	private WebElement passpercentage;
	
	public void sendPassPercentage(String passpercentage) {
		this.passpercentage.sendKeys(passpercentage);
}
	@FindBy(id="exercise_admin_submitExercise")
	private WebElement proceedquestions;
	
	public void clickProceedQuestionsBtn() {
		this.proceedquestions.click();
	
	}
	
	@FindBy(xpath="//img[@title='Multiple choice']")
	private WebElement multipleChoice;
	
	public void clickMultipleChoiceIcon() {
		this.multipleChoice.click();
	
	}
	
	@FindBy(name="questionName")
	private WebElement questionName;
	
	public void sendQuestionName(String questionName) {
		this.questionName.sendKeys(questionName);
}
	
	@FindBy(xpath="//div[@id=\"cke_2_contents\"]/iframe")
	private WebElement iframe1option1;
	
	@FindBy(xpath="//div[@id=\"cke_4_contents\"]/iframe")
	private WebElement iframe1option2;
	
	@FindBy(xpath="//div[@id=\"cke_6_contents\"]/iframe")
	private WebElement iframe1option3;
	
	@FindBy(xpath="//div[@id=\"cke_8_contents\"]/iframe")
	private WebElement iframe1option4;
	
     public void sendIframeoption1(String inputText1) {
		
			
		driver.switchTo().frame(iframe1option1);
		WebElement body = driver.switchTo().activeElement();
		body.sendKeys(inputText1);
		driver.switchTo().defaultContent();
		
		}
     
     public void sendIframeoption2(String inputText2) {
 		
			
 		driver.switchTo().frame(iframe1option2);
 		WebElement body = driver.switchTo().activeElement();
 		body.sendKeys(inputText2);
 		driver.switchTo().defaultContent();
 		
 		}
     
     public void sendIframeoption3(String inputText3) {
 		
			
 		driver.switchTo().frame(iframe1option3);
 		WebElement body = driver.switchTo().activeElement();
 		body.sendKeys(inputText3);
 		driver.switchTo().defaultContent();
 		
 		}
     public void sendIframeoption4(String inputText4) {
 		
			
 		driver.switchTo().frame(iframe1option4);
 		WebElement body = driver.switchTo().activeElement();
 		body.sendKeys(inputText4);
 		driver.switchTo().defaultContent();
 		
 		}
     @FindBy(xpath="//tbody/tr/td[5]/input[@id='question_admin_form_weighting[1]']")
     WebElement answer1;
     public void sendAnswerScore1(String answer1score) {
    	this.answer1.clear(); 
  		this.answer1.sendKeys(answer1score);
  	}
     @FindBy(xpath="//tbody/tr[2]/td[5]/input[@id='question_admin_form_weighting[2]']")
     WebElement answer2;
     public void sendAnswerScore2(String answer2score) {
    	this.answer2.clear(); 
  		this.answer2.sendKeys(answer2score);
  	}
     
     
     @FindBy(id="submit-question")
     private WebElement addQuestiontoTest;
     
     public void clickaddQuestiontoTestBtn() {
 		this.addQuestiontoTest.click();
 	}
	
     @FindBy(xpath="//input[@type='radio' and @value='1']")
     private WebElement optionradiobtn1;
     public void clickOptionRadioBtn1() {
  		this.optionradiobtn1.click();
  	}
     @FindBy(xpath="//input[@type='radio' and @value='2']")
     private WebElement optionradiobtn2;
     public void clickOptionRadioBtn2() {
  		this.optionradiobtn2.click();
  	}
     
     @FindBy(xpath="//img[@title='Preview']")
     private WebElement previewicon;
     public void clickPreviewIcon() {
   		this.previewicon.click();
   	}
     
     @FindBy(linkText="Start test")
     private WebElement startTest;
     public void clickStartTestBtn() {
   		this.startTest.click();
   	}
   
     @FindBy(xpath="//form[@id=\"exercise_form\"]/div[3]//label[1]/input")
     private WebElement chkRadioAns1;
     public void clickChkRadioAns() {
   		this.chkRadioAns1.click();
   	}
   //button[text()='Next question']
     
     @FindBy(xpath="//button[text()='Next question']")
     private WebElement nextquestion;
     public void clickNextQuestionBtn() {
   		this.nextquestion.click();
   	}
     
     @FindBy(xpath="//form[@id=\"exercise_form\"]/div[3]//label[2]/input")
     private WebElement chkRadioAns2;
     public void clickChkRadioAns2() {
   		this.chkRadioAns2.click();
     }
   	 @FindBy(xpath="//button[text()='End test']")
     private WebElement endtest;
     public void clickEndtestBtn() {
   		this.endtest.click();
   	}
     
     @FindBy(linkText="Reporting")
 	private WebElement reporting;
 	
 	public void clickReportingLnk() {
 		this.reporting.click();
 	
 	}
 	
 	@FindBy(linkText="Projects")
 	private WebElement projects;
 	
 	public void clickProjectsicon() {
 		this.projects.click();
 	
 	}
 	
 	@FindBy(xpath="//img[@title='Create a new project']")
 	private WebElement newproject;
 	
 	public void clicknewprojecticon() {
 		this.newproject.click();
 	
 	}
 	
 	@FindBy(id="add_blog_blog_name")
 	private WebElement titlenewproject;
 	
 	public void sendNewProjectTitle(String projecttitlename) {
 		
 		this.titlenewproject.sendKeys(projecttitlename);
 	
 	}
 	
 	@FindBy(xpath="//form/fieldset/div[2]/div/textarea[@id='add_blog_blog_subtitle']")
 	private WebElement subtitlenewproject;
 	
 	public void sendNewProjectSubTitle(String projectsubtitlename) {
 		
 		this.subtitlenewproject.sendKeys(projectsubtitlename);
 	
 	}
 	
 	@FindBy(id="add_blog_submit")
 	private WebElement saveblogbutton;
 	
 	public void clickSaveblogbutton() {
 		
 		this.saveblogbutton.click();
 	
 	}
 	
 	@FindBy(linkText="e learning")
 	private WebElement projectlink;
 	
     public void clickProjectLink() {
 		
 		this.projectlink.click();
 	
 	}
     
   
     @FindBy(xpath="//img[@title='New task']")
  	private WebElement newtaskicon;
  	
  	public void clickNewTaskIcon() {
  		
  		this.newtaskicon.click();
  	
  	}
  	
  	@FindBy(xpath="//input[@id='add_post_title']")
 	private WebElement newtaskTitle;
 	
 	public void sendNewTaskTitle(String newtasktitle) {
 		
 		this.newtaskTitle.sendKeys(newtasktitle);
 	
 	}
 	
 	@FindBy(xpath="//button[@id='add_post_save']")
  	private WebElement savebtn;
  	
  	public void clickonsavebtn() {
  		
  		this.savebtn.click();
  	
  	}
  	
  
  	@FindBy(xpath="//img[@title='Roles management']")
  	private WebElement rolesmanagement;
  	
  	public void clickRolesManagementicon() {
  		
  		this.rolesmanagement.click();
  	
  	}
  //img[@title='Add a new role']
  	
  	@FindBy(xpath="//img[@title='Add a new role']")
  	private WebElement addanewrole;
  	
  	public void clickAddaNewRoleLnk() {
  		
  		this.addanewrole.click();
  
  	}
  	
  	
  	@FindBy(name="task_name")
 	private WebElement newroletitle;
 	
 	public void sendNewRoleTitle(String newroletitle) {
 		
 		this.newroletitle.sendKeys(newroletitle);
 	
 	}
 	
 	@FindBy(name="Submit")
 	private WebElement newrolesubmit;
 	
 	public void clickNewRolesubmitBtn() {
 		
 		this.newrolesubmit.click();
 	
 	}
 	
 	@FindBy(xpath="//img[@title='Assign roles']")
  	private WebElement assignroles;
  	
  	public void clickassignrolesLnk() {
  		
  		this.assignroles.click();
  
  	}
  	
  	
  	@FindBy(id="assign_task_submit")
  	private WebElement validatebutton;
  	
  	public void clickValidateButton() {
  		
  		this.validatebutton.click();
  
  	}
  	
  	@FindBy(xpath="//img[@title='Users management']")
  	private WebElement usersmanagement;
  	
  	public void clickUsersManagementIcon() {
  		
  		this.usersmanagement.click();
  
  	}
  	
  
  	
  	@FindBy(xpath="//table/tbody/tr[2]/td/input")
  	private WebElement userscheckbox;
  	
  	public void clickUserCheckboxRadioBtn() {
  		
  		this.userscheckbox.click();  
  	}
  
  	@FindBy(xpath="//div[@class='alert alert-success']")
  	private WebElement registeredmessage;
  	
  	public String registeredmessageText() {
  		
  		return this.registeredmessage.getText();
  	}
  
  	
  	@FindBy(xpath="//table/tbody/tr[2]/td[5]/a")
  	private WebElement registerbtn;
  	
  	public void clickRegisterBtn() {
  		
  		this.registerbtn.click();  
  	}
  	
  	@FindBy(linkText="Groups")
	private WebElement groupsicon;
  	
     public void clickGroupsIcon() {
  		
  		this.registerbtn.click();  
  	}
	
   //table/tbody/tr/td[3]/a[3]
     
     @FindBy(xpath="//table/tbody/tr/td[3]/a[3]")
 	private WebElement resultsandFeedback;
   	
      public void clickResultsandFeedbackIcon() {
   		
   		this.resultsandFeedback.click();  
   	}
      
    
     @FindBy(xpath="//table[@id='results']/tbody/tr[2]/td[12]/div/a")
  	private WebElement gradeicon;
    	
       public void clickGradeActivityIcon() {
    		
    		this.gradeicon.click();  
    	}
     
/*	@FindBy(xpath="//img[@title='Add a question']")
	private WebElement addQuestion;
	
	public void clickaddQuestionIcon() {
		this.addQuestion.click();
	}
		
		@FindBy(id="add_question_SubmitCreateQuestion")
		private WebElement createQuestion;
		
		public void clickcreateQuestionBtn() {
			this.createQuestion.click();
		} */
	
}
	


	

