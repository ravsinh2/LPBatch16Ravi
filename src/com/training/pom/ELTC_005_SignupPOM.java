package com.training.pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ELTC_005_SignupPOM 
{
private WebDriver driver; 
	
	public ELTC_005_SignupPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='http://elearningm1.upskills.in/main/auth/inscription.php']")
	private WebElement signup; 
	
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastname;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement username;
	
	@FindBy(xpath="//input[@name='pass1']")
	private WebElement password;
	
	@FindBy(xpath="//input[@name='pass2']")
	private WebElement confirmPassword;
	
	@FindBy(xpath="//input[@name='phone']")
	private WebElement phone;
	
	@FindBy(xpath="//span[@class='caret']")
	private WebElement language;
	
	@FindBy(xpath="//p[contains(text(),'Teach courses')]")
	private WebElement teachCoursesClick;
	
	@FindBy(xpath="//button[@name='submit']")
	private WebElement register;
	

	public void teacherSignup() throws InterruptedException, AWTException {
		this.signup.click();
		Thread.sleep(1000);
		this.firstname.sendKeys("manzoor");
		Thread.sleep(1000);
		this.lastname.sendKeys("mehadi");
		Thread.sleep(1000);
		this.email.sendKeys("manzoor@gmail.com");
		Thread.sleep(1000);
		this.username.sendKeys("manzoor");
		Thread.sleep(1000);
		this.password.sendKeys("manzoor");
		Thread.sleep(1000);
		this.confirmPassword.sendKeys("manzoor");
		Thread.sleep(1000);
		this.phone.sendKeys("9876543210");
		Thread.sleep(1000);
		this.language.click();
		Thread.sleep(1000);
		
		//Select sel =new Select(this.language);
		//sel.selectByVisibleText("English");
		
		Robot robo =new Robot();
		robo.keyPress(KeyEvent.VK_ENTER);
		
		
		
		Thread.sleep(3000);
		this.teachCoursesClick.click();
		Thread.sleep(3000);
		//this.register.click();
		
		
		
		
	
}
}
