package com.training.regression.tests;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.dataproviders.LoginDataProviders;
import com.training.generics.ScreenShot;
import com.training.pom.AddUserPOM;
import com.training.pom.AdminPOM;
import com.training.pom.CourseCatalogPOM;
import com.training.pom.CoursecreatedPOM;
import com.training.pom.LoginPOM;
import com.training.pom.MyCoursesPOM;
import com.training.pom.ReportingPOM;
import com.training.pom.UserMyCourcesPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;


public class ELTC_066_Tests {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private Properties properties;
	private ScreenShot screenShot;
	private MyCoursesPOM myCourses;
	private CourseCatalogPOM coursecatalogPOM;
	private UserMyCourcesPOM userMyCourse;
	private CourseCatalogPOM courseCatlog;
	private ReportingPOM reporting;
	

	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		
		
	}
	

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver);
		// open the browser
		driver.get(baseUrl);
	/*	loginPOM.sendUserName("LeninNagandla3");
		loginPOM.sendPassword("Lenin@1233");
		loginPOM.clickLoginBtn(); */
		
	}

	
@Test(priority=1, dataProvider = "excel-inputs", dataProviderClass = LoginDataProviders.class)
	public void teacherLoginTest(String userName, String password) {
		loginPOM.sendUserName(userName);
		loginPOM.sendPassword(password);
		loginPOM.clickLoginBtn();
		myCourses = new MyCoursesPOM(driver);
		myCourses.clickCourseCreated();
		myCourses.clickonTestsicon();
		myCourses.clickonCreateNewTestBtn();
		myCourses.sendTestName("online quiz");
		myCourses.clickAdvanSettings();
		myCourses.sendIframetextbox("quiz");
		myCourses.clickEnableStartDateRadioBtn();
		myCourses.clickonDate();
		myCourses.sendPassPercentage("50");
		myCourses.clickProceedQuestionsBtn();
		myCourses.clickMultipleChoiceIcon();
	    myCourses.sendQuestionName("which course your learning");
		myCourses.sendIframeoption1("selenium");
		myCourses.sendIframeoption2("java");
		myCourses.sendIframeoption3("c");
		myCourses.sendIframeoption4("c#");
		myCourses.sendAnswerScore1("1");
		myCourses.clickOptionRadioBtn1();
		myCourses.clickaddQuestiontoTestBtn();
		myCourses.clickMultipleChoiceIcon();
	    myCourses.sendQuestionName("which language are you using in selenium");
		myCourses.sendIframeoption1("python");
		myCourses.sendIframeoption2("java");
		myCourses.sendIframeoption3("c");
		myCourses.sendIframeoption4("c#");
		myCourses.sendAnswerScore2("1");
		myCourses.clickOptionRadioBtn2();
		myCourses.clickaddQuestiontoTestBtn();
		myCourses.clickPreviewIcon();
		myCourses.clickStartTestBtn();
		myCourses.clickChkRadioAns();
		myCourses.clickNextQuestionBtn();
		myCourses.clickChkRadioAns2();
		myCourses.clickEndtestBtn();
		driver.close();
		
	} 

	@Test(priority=2, dataProvider = "excel-inputs1", dataProviderClass = LoginDataProviders.class)
	public void studentLoginAndTakeTest(String userName, String password) {
		loginPOM.sendUserName(userName);
		loginPOM.sendPassword(password);
		loginPOM.clickLoginBtn();	
		userMyCourse = new UserMyCourcesPOM(driver);
		userMyCourse.clickCourseCatalogBtn();
		courseCatlog = new CourseCatalogPOM(driver);
		courseCatlog.clickCourseCatalogSearch("SeleniumA");
		courseCatlog.clickOnSearch();
		//courseCatlog.clickOnSubscribe();
		myCourses = new MyCoursesPOM(driver);
		myCourses.mycoursesLnk();
		//myCourses.clickCourseCreated();
		userMyCourse = new UserMyCourcesPOM(driver);
		userMyCourse.clickUserCourseSeleniumALnk();
		userMyCourse.clickonTestsicon();
		userMyCourse.userclickOnlineQuiz();
		myCourses = new MyCoursesPOM(driver);
		myCourses.clickStartTestBtn();
		myCourses.clickChkRadioAns();
		myCourses.clickNextQuestionBtn();
		myCourses.clickChkRadioAns2();
		myCourses.clickEndtestBtn();
		driver.close();
		
	}
	
	
	
	@Test(priority=3, dataProvider = "excel-inputs", dataProviderClass = LoginDataProviders.class)
	public void teacherReviewTest(String userName, String password) {
		loginPOM.sendUserName(userName);
		loginPOM.sendPassword(password);
		loginPOM.clickLoginBtn();
		myCourses = new MyCoursesPOM(driver);
		myCourses.clickCourseCreated();
		myCourses.clickonTestsicon();
		myCourses.clickResultsandFeedbackIcon();
		myCourses.clickGradeActivityIcon();
		reporting = new ReportingPOM(driver);
		reporting.clickSendEmailcheckbox();
		reporting.clickCorrectTestBtn();
		String expmeassage="Message Sent";
		String actmessage=reporting.messageSentText();
		System.out.println(reporting.messageSentText());
		Assert.assertEquals(actmessage, expmeassage);
	//	driver.close();
		
	} 
	
	
/*	@AfterMethod
	public void closewindow() {
		
	}*/
	
   
 
}
