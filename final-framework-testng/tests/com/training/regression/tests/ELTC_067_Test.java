package com.training.regression.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.training.bean.LoginBean;
import com.training.dao.ELearningDAO;
import com.training.dataproviders.LoginDataProviders;
import com.training.generics.ScreenShot;
import com.training.pom.AddUserPOM;
import com.training.pom.AdminPOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_067_Test {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private AdminPOM adminuserlk;
	private AddUserPOM addauserlk;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
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
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
		
	}

	@Test(dataProvider = "excel-inputs1", dataProviderClass = LoginDataProviders.class)
	public void loginDBTest(String firstName, String lastName, String emailUser, String phoneNumber, String tuserName, String tpassword) {
		adminuserlk = new AdminPOM(driver);
		adminuserlk.clickAddauserlink();
		addauserlk = new AddUserPOM(driver);
		addauserlk.sendFirstName(firstName);
		addauserlk.sendLastName(lastName);
		addauserlk.sendEmail(emailUser);
		addauserlk.sendPhoneNo(phoneNumber);
		addauserlk.sendTuserName(tuserName);
		addauserlk.clickradioBtn();
		addauserlk.sendTpassword(tpassword);
		addauserlk.dropdownSelectPro();
		addauserlk.dropdownSelectLan();
		addauserlk.clickSubmitBtn();	
		String expmessage="The user has been added:"; 
		String actmessage=addauserlk.userSuccAddedMess();
		System.out.println(addauserlk.userSuccAddedMess());
		//Assert.assertEquals(expmessage, actmessage);
		boolean aserttext= actmessage.contains(expmessage);
		Assert.assertTrue(aserttext);
		
		
		//screenShot.captureScreenShot(userName);
		
	}
	
/*	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
	}*/

}