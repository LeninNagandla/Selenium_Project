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
import com.training.pom.CoursecreatedPOM;
import com.training.pom.LoginPOM;
import com.training.pom.MyCoursesPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;


public class CourseDescTests {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private Properties properties;
	private ScreenShot screenShot;
	private  CoursecreatedPOM createAcourse;
	private MyCoursesPOM myCourses;
	

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
	public void registerTrainer() throws InterruptedException {	
		myCourses = new MyCoursesPOM(driver);
		myCourses.clickCourseCreated();
		myCourses.clickCourseDescIcon();
		myCourses.clickonDescIcon();
		Thread.sleep(10000);
		myCourses.sendTitleInputBox("selenium course for beginners");
		myCourses.sendIframetextbox("selenium course for beginners");
		myCourses.clickSave2Btn();
			
	}
	@Test(dependsOnMethods="registerTrainer")
	public void myCousesAdd() {
		
		
	}
   
 
}
