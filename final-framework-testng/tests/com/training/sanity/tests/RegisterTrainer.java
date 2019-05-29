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
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;


public class RegisterTrainer {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private Properties properties;
	private ScreenShot screenShot;
	private AdminPOM adminuserlk;
	private AddUserPOM addauserlk;

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
		adminuserlk = new AdminPOM(driver);
		adminuserlk.clickAddauserlink();
	}

	@Test(priority=1)
	public void registerTrainer() {	
		addauserlk = new AddUserPOM(driver);
		addauserlk.sendFirstName("Lenin4");
		addauserlk.sendLastName("Nagandla4");
		addauserlk.sendEmail("lenin4@demo.com");
		addauserlk.sendTuserName("LeninNagandla4");
		addauserlk.clickradioBtn();
		addauserlk.sendTpassword("Lenin@1234");
		addauserlk.dropdownSelectPro();
		addauserlk.dropdownSelectLan();
		addauserlk.clickSubmitBtn();
		
		
	}
   
 
}
