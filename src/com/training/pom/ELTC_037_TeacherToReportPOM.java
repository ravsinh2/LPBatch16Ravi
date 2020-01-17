package com.training.pom;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ELTC_037_TeacherToReportPOM {
private WebDriver driver; 
	
	public ELTC_037_TeacherToReportPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//a[@href='http://elearningm1.upskills.in/courses/TESTRAVITESTCASES/index.php?id_session=0']")
	private WebElement raviTest; 
	
	@FindBy(xpath="//img[@title='Reporting']")
	private WebElement reportingIcon ; 
	
	@FindBy(xpath="//img[@title='Details']")
	private WebElement detailsIcon; 
	
	@FindBy(xpath="//img[@title='Grade activity']")
	private WebElement gradeActivity; 
	
	

	public void teacherReport() throws InterruptedException, AWTException {
		this.raviTest.click();
		Thread.sleep(1000);
		this.reportingIcon.click();
		Thread.sleep(1000);
		this.detailsIcon.click();
		Thread.sleep(1000);
				
		
		
		
		
		
	
}
}
