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


public class AdminCreateCourceTests {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private Properties properties;
	private ScreenShot screenShot;
	private  CoursecreatedPOM createAcourse;
	private MyCoursesPOM myCourses;
	private AdminPOM adminuserlk;
	

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
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot("First");
		
	}

	@Test
	public void deleteCoursescategories() {	
		adminuserlk = new AdminPOM(driver);
		adminuserlk.clickcoursesCategorieslnk();
		adminuserlk.deleteCategoryicon();
	}
	
	@Test(enabled=false)
	public void adminaddcoursecategory() {	
		adminuserlk = new AdminPOM(driver);
		adminuserlk.clickAdminCoursesCategorieslnk();
		adminuserlk.clickAddCategoryicon();
		adminuserlk.sendCategoryCode("BL1");
		adminuserlk.sendCategoryName("Blended Learning1");
		adminuserlk.clickAddCategorybtn();
		
	}
	
	@Test(enabled=false)
	public void adminCreateACourseToUser() {	
		adminuserlk = new AdminPOM(driver);
		adminuserlk.clickAddUsersToCourse();
		adminuserlk.selectUserlist();
		adminuserlk.selectCourselist();
		adminuserlk.clickAddtheCoursebtn();		
	}
	
	@Test(enabled=false)
	public void adminCreateACourse() {	
		adminuserlk = new AdminPOM(driver);
		adminuserlk.clickAdminCreateCourselink();
		createAcourse = new CoursecreatedPOM(driver);
		createAcourse.sendAdminCreateCourseTitle("testing");
		createAcourse.sendAdminCreateCourseCode("tes");
		createAcourse.clickandSendCourseTeachers();
		createAcourse.dropdownAdminCategory();
		createAcourse.dropdownAdminLang();
		createAcourse.clickAdminCreateCourseBtn();
	}
	
	
   
 
}
