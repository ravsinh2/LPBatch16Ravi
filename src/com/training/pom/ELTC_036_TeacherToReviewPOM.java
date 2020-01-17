package com.training.pom;

import java.awt.AWTException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ELTC_036_TeacherToReviewPOM {
private WebDriver driver; 
	
	public ELTC_036_TeacherToReviewPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//a[@href='http://elearningm1.upskills.in/courses/TESTRAVITESTCASES/index.php?id_session=0']")
	private WebElement raviTest; 
	
	@FindBy(xpath="//img[@alt='Tests']")
	private WebElement testsIcon ; 
	
	@FindBy(xpath="//img[@title='Results and feedback']")
	private WebElement resultsFeedbackIcon; 
	
	@FindBy(xpath="//img[@title='Grade activity']")
	private WebElement gradeActivity; 
	
	@FindBy(xpath="//input[@name='send_notification']")
	private WebElement sendEmailRadioBtn; 
	
	@FindBy(xpath="//button[@name='submit']")
	private WebElement correctTest; 
	

	public void teacherReview() throws InterruptedException, AWTException {
		this.raviTest.click();
		Thread.sleep(1000);
		this.testsIcon.click();
		Thread.sleep(1000);
		this.resultsFeedbackIcon.click();
		Thread.sleep(1000);
		this.gradeActivity.click();
		Thread.sleep(1000);
		this.sendEmailRadioBtn.click();
		Thread.sleep(1000);
		this.correctTest.click();
		Thread.sleep(1000);
		
		
		
		
		
		
		
		
	
}
}
