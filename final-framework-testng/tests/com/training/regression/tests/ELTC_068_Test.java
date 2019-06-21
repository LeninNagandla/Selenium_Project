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
import com.training.generics.GenericMethods;
import com.training.generics.ScreenShot;
import com.training.pom.AddUserPOM;
import com.training.pom.AdminPOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_068_Test {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private GenericMethods genericMethods; 
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
		genericMethods = new GenericMethods(driver); 
		// open the browser
		driver.get(baseUrl);
		loginPOM.sendUserName("admin");			
		loginPOM.sendPassword("admin@123");		
		loginPOM.clickLoginBtn();
	}

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}


	/*@Test(dataProvider = "db-inputs", dataProviderClass = LoginDataProviders.class)
	public void loginDBTest(String userName, String password) {
		// for demonstration 
//		genericMethods.getElement("login", "id"); 
				
		loginPOM.sendUserName("admin");
		String USERNAME = loginPOM.getUserName();		
		loginPOM.sendPassword("admin@123");
		String PASSWORD = loginPOM.getPassword();
		loginPOM.clickLoginBtn();
		Assert.assertEquals(USERNAME, userName);
		Assert.assertEquals(PASSWORD, password);
		
		//screenShot.captureScreenShot(userName);

	} */
	
	@Test(dataProvider = "db-inputs", dataProviderClass = LoginDataProviders.class)
	public void loginDBTest(String firstName, String lastName, String emailUser, String phoneNumber, String tuserName, String tpassword) {
		adminuserlk = new AdminPOM(driver);
		adminuserlk.clickAddauserlink();
		addauserlk = new AddUserPOM(driver);
		addauserlk.sendFirstName(firstName);
		String FIRSTNAME = addauserlk.getFirstName();
		addauserlk.sendLastName(lastName);
		String LASTNAME = addauserlk.getLastName();
		addauserlk.sendEmail(emailUser);
		String EMAILUSER = addauserlk.getEmail();
		addauserlk.sendPhoneNo(phoneNumber);
		String PHONENUMBER = addauserlk.getPhoneNo();
		addauserlk.sendTuserName(tuserName);
		String TUSERNAME = addauserlk.getTuserName();
		addauserlk.clickradioBtn();
		addauserlk.sendTpassword(tpassword);
		String TPASSWORD = addauserlk.getTpassword();
		Assert.assertEquals(FIRSTNAME, firstName);
		Assert.assertEquals(LASTNAME, lastName);
		Assert.assertEquals(EMAILUSER, emailUser);
		Assert.assertEquals(PHONENUMBER, phoneNumber);
		Assert.assertEquals(TUSERNAME, tuserName);
		Assert.assertEquals(TPASSWORD, tpassword);
		addauserlk.dropdownSelectPro();
		addauserlk.dropdownSelectLan();
		addauserlk.clickSubmitBtn();	
		String expmessage="The user has been added:"; 
		String actmessage=addauserlk.userSuccAddedMess();
		System.out.println(addauserlk.userSuccAddedMess());
		boolean aserttext= actmessage.contains(expmessage);
		Assert.assertTrue(aserttext);
		
		
		//screenShot.captureScreenShot(userName);
		
	}

}