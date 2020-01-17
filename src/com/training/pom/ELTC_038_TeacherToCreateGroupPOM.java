package com.training.pom;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ELTC_038_TeacherToCreateGroupPOM {
private WebDriver driver; 
	
	public ELTC_038_TeacherToCreateGroupPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//a[@href='http://elearningm1.upskills.in/courses/TESTRAVITESTCASES/index.php?id_session=0']")
	private WebElement raviTest; 
	
	@FindBy(xpath="//img[@title='Groups']")
	private WebElement groupsIcon ; 
	
	@FindBy(xpath="//img[@title='Create new group(s)']")
	private WebElement createNewGroupsIcon; 
	
	@FindBy(xpath="//input[@name='number_of_groups']")
	private WebElement numberOfGroupsTextBox; 
	
	@FindBy(xpath="//button[@id='create_groups_submit']")
	private WebElement proceedToCreate; 
	
	@FindBy(xpath="//input[@name='group_0_name']")
	private WebElement groupName; 
	
	@FindBy(xpath="//button[@id='create_groups_step2_submit']")
	private WebElement createGroupButton; 
	
	@FindBy(xpath="//img[@title='Group members']")
	private WebElement groupMembersIcon; 
	
	@FindBy(id ="group_members")
	private WebElement students; 
	
	@FindBy(xpath ="//em[@class='fa fa-arrow-right']")
	private WebElement arrow; 
	
	@FindBy(xpath ="//button[@id='group_edit_submit']")
	private WebElement saveSettingsButton; 
	
	@FindBy(xpath ="//img[@title='Edit this group']")
	private WebElement editGroup; 
	
	@FindBy(xpath ="//input[@name='self_registration_allowed']")
	private WebElement registerCheckBox;
	
	@FindBy(xpath ="//input[@name='self_unregistration_allowed']")
	private WebElement unRegisterCheckBox;
	
	@FindBy(xpath ="//button[@id='group_edit_submit']")
	private WebElement saveEditSettings;

	public void teacherToCreateGroup() throws InterruptedException, AWTException {
		this.raviTest.click();
		Thread.sleep(1000);
		this.groupsIcon.click();
		Thread.sleep(1000);
		this.createNewGroupsIcon.click();
		Thread.sleep(1000);
		this.numberOfGroupsTextBox.clear();
		this.numberOfGroupsTextBox.sendKeys("1");
		Thread.sleep(1000);
		this.proceedToCreate.click();
		Thread.sleep(1000);
		this.groupName.clear();
		this.groupName.sendKeys("Rockers");
		Thread.sleep(1000);
		this.createGroupButton.click();
		Thread.sleep(1000);
		this.groupMembersIcon.click();
		Thread.sleep(1000);
		
		Select sel = new Select(students);
		
		sel.selectByVisibleText("Ravi Sinha (Sinha) - SINHA");
		
		Thread.sleep(1000);
		this.arrow.click();
		Thread.sleep(1000);
		this.saveSettingsButton.click();
		Thread.sleep(1000);
		this.editGroup.click();
		Thread.sleep(1000);		
		this.registerCheckBox.click();
		Thread.sleep(1000);
		this.unRegisterCheckBox.click();
		Thread.sleep(1000);
		this.saveEditSettings.click();
		Thread.sleep(1000);
		
		
		
		
		
		
		
		
		
	
}
}
