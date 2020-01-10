package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ELTC_004_LostPasswordPOM {

private WebDriver driver; 
	
	public ELTC_004_LostPasswordPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//a[@href='http://elearningm1.upskills.in/main/auth/lostPassword.php']")
	private WebElement Ilostpassword;
	
	@FindBy(xpath="//input[@id='lost_password_user']")
	private WebElement enterUserName;
	
	
	@FindBy(xpath="//button[@id='lost_password_submit']")
	private WebElement sendMessage;
	

	public void lostPassword() throws InterruptedException {
		this.Ilostpassword.click();
		Thread.sleep(1000);
		this.enterUserName.sendKeys("manzoor");
		Thread.sleep(1000);
		this.sendMessage.click();
	
		
		
		
		
		
	
}
	
}
