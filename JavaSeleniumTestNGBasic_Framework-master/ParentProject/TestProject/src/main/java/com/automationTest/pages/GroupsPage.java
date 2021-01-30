package com.automationTest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import com.framework.exceptions.DriverNotInitializedException;
import com.framework.page.BasePage;
import com.framework.page.TestPage;

public class GroupsPage extends BasePage implements TestPage {

	public GroupsPage(WebDriver driver) throws DriverNotInitializedException {
		super(driver);
		
	}
	
	@FindBy(xpath="//div[@class='dropdown dropdown--profileMenu']")
	private WebElement ClickProfileIcon;
	
	@FindBy(xpath="//div[@class='dropdown dropdown--profileMenu']/div/div/ul/li[3]")
	private WebElement Groups;
	
	@FindBy(xpath="//div[@class='elementList']//div/a")
	private WebElement GroupList;
	
	@FindBy(xpath="//a[text()='Edit Group Settings']")
	private WebElement EditGroupLink;
	
	@FindBy(xpath="//div[@class='leftContainer']/div/div[1]/input[@id='group_title']")
	private WebElement ChangegrpName;
	
	@FindBy(xpath="//div[@id='flashContainer']//a")
	private WebElement SnackBarMsg;
	
	
	
	
	public GroupsPage editGroup(String groupname) {
		
		wait.until(ExpectedConditions.visibilityOf(ClickProfileIcon)).click();
		wait.until(ExpectedConditions.visibilityOf(Groups)).click();
		
		String oldName = GroupList.getText();
		System.out.println(oldName);
		
		wait.until(ExpectedConditions.visibilityOf(GroupList)).click();
		wait.until(ExpectedConditions.visibilityOf(EditGroupLink)).click();
		wait.until(ExpectedConditions.visibilityOf(ChangegrpName)).click();
		ChangegrpName.clear();
		wait.until(ExpectedConditions.visibilityOf(ChangegrpName)).click();
		wait.until(ExpectedConditions.visibilityOf(ChangegrpName)).sendKeys(groupname);
		
		Assert.assertEquals(oldName, false);
		
		
		
		
		
		return this;
	}
	
public GroupsPage createGroup() {
		
		return this;
	}

}
