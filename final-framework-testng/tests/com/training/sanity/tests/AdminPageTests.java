package com.training.sanity.tests;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.AdminPOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;


public class AdminPageTests {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private Properties properties;
	private ScreenShot screenShot;
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

	@Test(priority=1)
	public void validLoginTest() {	
		adminuserlk = new AdminPOM(driver);
		adminuserlk.clickAddauserlink();
	}
   /*  @Test(priority=2)
	//@Test(dependsOnMethods="validLoginTest")
	public void adminTest() throws InterruptedException {
		Thread.sleep(1000);
		adminuserlk.clickAddauserlink(); 
	}*/
 
}
