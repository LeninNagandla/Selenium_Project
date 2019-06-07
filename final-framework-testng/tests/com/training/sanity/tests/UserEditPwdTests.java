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
import com.training.pom.UserEditProfilePOM;
import com.training.pom.UserMyCourcesPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;


public class UserEditPwdTests {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private Properties properties;
	private ScreenShot screenShot;
	private UserMyCourcesPOM userMyCourse;
	private UserEditProfilePOM userEditProfilePOM;
	
	

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
		loginPOM.sendUserName("LeninNagandla4");
		loginPOM.sendPassword("Lenin@1234");
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot("First");
		
	}

	@Test(priority=1)
	public void registerTrainer() throws InterruptedException {	
		
		userMyCourse = new UserMyCourcesPOM(driver);
		userMyCourse.clickUserEditProfileLnk();
		userEditProfilePOM = new UserEditProfilePOM(driver);
		userEditProfilePOM.sendprofilepwdold("Lenin@1234");
		userEditProfilePOM.sendprofilepwdNew("Lenin@12344");
		userEditProfilePOM.sendprofileconfirmpwd("Lenin@12344");
		userEditProfilePOM.clickSavePwd();
		
			
	}
	
   
 
}
