package com.training.sanity.tests;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.http.util.Asserts;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
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


public class TeacherReviewTestELTC_040Tests {
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
	public void registerTrainer(){	
		myCourses = new MyCoursesPOM(driver);
		myCourses.clickCourseCreated();
		myCourses.clickProjectsicon();
		myCourses.clicknewprojecticon();
		myCourses.sendNewProjectTitle("e learning");
		myCourses.sendNewProjectSubTitle("e learning project");
		myCourses.clickSaveblogbutton();
		myCourses.clickProjectLink();
		myCourses.clickNewTaskIcon();
		myCourses.sendNewTaskTitle("design");
		myCourses.clickonsavebtn();
		myCourses.clickRolesManagementicon();
		myCourses.clickAddaNewRoleLnk();
		myCourses.sendNewRoleTitle("developer");
		myCourses.clickNewRolesubmitBtn();
		myCourses.clickassignrolesLnk();
		myCourses.clickValidateButton();
		myCourses.clickUsersManagementIcon();
		myCourses.clickUserCheckboxRadioBtn();
		myCourses.clickRegisterBtn();
		String expmeassage="The user has been registered";
		String actmessage=myCourses.registeredmessageText();
		System.out.println(myCourses.registeredmessageText());
		Assert.assertEquals(actmessage, expmeassage);
		
	}
	
   
 
}
