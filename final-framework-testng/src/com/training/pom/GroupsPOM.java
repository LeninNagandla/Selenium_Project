package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class GroupsPOM {
	private WebDriver driver; 
	
	public GroupsPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}	
	
	@FindBy(xpath="//*[@alt='Create new group(s)']")
	private WebElement createGroup;	
	
	public void clickCreateAnewGroupIcon() {
		this.createGroup.click(); 
	}
	
	
	@FindBy(id="create_groups_submit")
	private WebElement proceedGroups;	
	
	public void clickProceedtoCreateGroupBtn() {
		this.proceedGroups.click(); 
	}
	
	
	
	@FindBy(xpath="//table/tbody/tr[2]/td[2]/input")
	private WebElement groupName;	
	
	public void sendGroupNametextbox(String groupName) {
		this.groupName.clear(); 
		this.groupName.sendKeys(groupName);
	}
	
	
	
	@FindBy(xpath="//table/tbody/tr[3]/td[2]/button")
	private WebElement createGroupsBtn;	
	
	public void clickCreateGroupsBtn() {
		this.createGroupsBtn.click(); 
	}
	
	@FindBy(xpath="//table/tbody/tr[2]/td[4]/a[3]")
	private WebElement groupmembers;
	
	public void clickGroupMemberIcon() {
		
		this.groupmembers.click();
	}
	
	@FindBy(id="group_members")
	private WebElement selectmemberList;
	
	public void selectMembersfromList( ) {
		Select member = new Select(this.selectmemberList);
		member.selectByVisibleText("Lenin7 Nagandla7 (LeninNagandla7)");		
		
	}
	
	@FindBy(id="group_members_rightSelected")
	private WebElement arrowRight;
	
	public void selectArrowRight( ) {
		this.arrowRight.click();		
		
	}
	
	@FindBy(id="group_edit_submit")
	private WebElement saveSettings;
	
	public void clickSaveSettingsBtn( ) {
		this.saveSettings.click();		
		
	}
	
	@FindBy(xpath="//table/tbody/tr[2]/td[4]/a[1]")
	private WebElement editsettingsicon;
	
	public void clickEditSettingsIcon() {
		
		this.editsettingsicon.click();
	}
	
	@FindBy(name="self_registration_allowed")
	private WebElement selfRegAllowed;
	
	public void clickLearnersRegAllowedChkBox() {
		
		this.selfRegAllowed.click();
	}
	@FindBy(name="self_unregistration_allowed")
	private WebElement unRegAllowed;
	
	public void clickLearnerUnRegChkBox() {
		
		this.unRegAllowed.click();
	}
	
	
	@FindBy(id="group_edit_submit")
	private WebElement editSaveSettings;
	
	public void clickEditSaveSettingsBtn() {
		
		this.editSaveSettings.click();
	}
	
	//div[@class='alert alert-success']
	
	@FindBy(xpath="//div[@class='alert alert-success']")
	private WebElement groupsettingsMessage;
	
	public String groupSettingsModMessage() {
		
		return this.groupsettingsMessage.getText();
	}
}
	


	

