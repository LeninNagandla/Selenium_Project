package com.training.sanity.tests;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.AddUserPOM;
import com.training.pom.AdminPOM;
import com.training.pom.CourseCatalogPOM;
import com.training.pom.CoursecreatedPOM;
import com.training.pom.LoginPOM;
import com.training.pom.MyCoursesPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;


public class TeacherCreatTestELTC_032Tests {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private Properties properties;
	private ScreenShot screenShot;
	private MyCoursesPOM myCourses;
	private CourseCatalogPOM coursecatalogPOM;
	

	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
		loginPOM.sendUserName("LeninNagandla3");
		loginPOM.sendPassword("Lenin@1233");
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot("First");
		
	}

	@Test(priority=1)
	public void createOnlieTest(){	
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
		myCourses.clickaddQuestiontoTestBtn();
		myCourses.clickMultipleChoiceIcon();
	    myCourses.sendQuestionName("which language are you using in selenium");
		myCourses.sendIframeoption1("python");
		myCourses.sendIframeoption2("java");
		myCourses.sendIframeoption3("c");
		myCourses.sendIframeoption4("c#");
		myCourses.clickOptionRadioBtn();
		myCourses.clickaddQuestiontoTestBtn();
		myCourses.clickPreviewIcon();
		myCourses.clickStartTestBtn();
		myCourses.clickChkRadioAns();
		myCourses.clickNextQuestionBtn();
		myCourses.clickChkRadioAns2();
		myCourses.clickEndtestBtn();
		
		
	//	myCourses.clickaddQuestionIcon();
	//	myCourses.clickcreateQuestionBtn();
		
	}
	
   
 
}
