package com.training.sanity.tests;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.ELTC_036_TeacherToReviewPOM;
import com.training.pom.ELTC_038_TeacherToCreateGroupPOM;
import com.training.pom.HomePOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_038_TeacherToCreateGroupTests {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private HomePOM homepom;
	
	private ELTC_038_TeacherToCreateGroupPOM TeacherToCreateGroupPOM;
	private static Properties properties;
	private ScreenShot screenShot;

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
		homepom = new HomePOM(driver); 
			
		TeacherToCreateGroupPOM = new ELTC_038_TeacherToCreateGroupPOM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	//@AfterMethod
	//public void tearDown() throws Exception {
		//Thread.sleep(1000);
		//driver.quit();
//}
	
	@Test
	public void TeacherToReviewTest() throws InterruptedException, AWTException {
		loginPOM.sendUserName("Murari");
		loginPOM.sendPassword("krishna");
		loginPOM.clickLoginBtn();
		
		TeacherToCreateGroupPOM.teacherToCreateGroup();
		
		
		
		 
		screenShot.captureScreenShot("First");
		
	}
}
