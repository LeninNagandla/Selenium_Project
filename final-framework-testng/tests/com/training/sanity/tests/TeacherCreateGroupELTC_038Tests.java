package com.training.sanity.tests;


import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

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
import com.training.pom.GroupsPOM;
import com.training.pom.LoginPOM;
import com.training.pom.MyCoursesPOM;
import com.training.pom.ReportingPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;


public class TeacherCreateGroupELTC_038Tests {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private Properties properties;
	private ScreenShot screenShot;
	private MyCoursesPOM myCourses;
	private GroupsPOM groups;
	

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
	public void teacherCreateGroups(){	
		myCourses = new MyCoursesPOM(driver);
		myCourses.clickCourseCreated();
		myCourses.clickGroupsIcon();
		groups = new GroupsPOM(driver);
		groups.clickCreateAnewGroupIcon();
		groups.clickProceedtoCreateGroupBtn();
		groups.sendGroupNametextbox("rockers");
		groups.clickCreateGroupsBtn();
		groups.clickGroupMemberIcon();
		groups.selectMembersfromList();
		groups.selectArrowRight();
		groups.clickSaveSettingsBtn();
		groups.clickEditSettingsIcon();
		groups.clickLearnersRegAllowedChkBox();
		groups.clickLearnerUnRegChkBox();
		groups.clickEditSaveSettingsBtn();
		String expmessage="Group settings modified";
		String actmessage=groups.groupSettingsModMessage();
		System.out.println(groups.groupSettingsModMessage());
		Assert.assertEquals(expmessage, actmessage);
		
	}
	
   
 
}
