package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.ELTC_006_TeacherLoginPOM;
import com.training.pom.HomePOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_006_TeacherLoginTests {

	private WebDriver driver;
	private String baseUrl;
	private ELTC_006_TeacherLoginPOM teacherloginPOM;
	private HomePOM homepom;
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
		teacherloginPOM = new ELTC_006_TeacherLoginPOM(driver);
		homepom = new HomePOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
}
	
	@Test
	public void validLoginTest() {
		teacherloginPOM.sendUserName("manzoor");
		teacherloginPOM.sendPassword("manzoor");
		teacherloginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot("First");
		
	}
	
	
}
