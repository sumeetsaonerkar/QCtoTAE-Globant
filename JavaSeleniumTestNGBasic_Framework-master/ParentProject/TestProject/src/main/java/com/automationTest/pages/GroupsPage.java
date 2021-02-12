package com.automationTest.pages;

import org.openqa.selenium.JavascriptExecutor;
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
	
	@FindBy(xpath="//div[@class='box noticeBox']//div")
	private WebElement SnackBarMsg;
	
	@FindBy(xpath="//input[@class='gr-form__submitButton']")
	private WebElement SaveButton;
	
	
	
	public GroupsPage editGroup(String groupname) {
		
		String expected = "The group's data have been saved";
		
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
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		
		wait.until(ExpectedConditions.visibilityOf(SaveButton)).click();
		
		/*
		 * String newName = GroupList.getText(); System.out.println(newName);
		 */
		
		
		String actual = SnackBarMsg.getText();
		System.out.println(actual);
		
		Assert.assertEquals(actual, expected);
		
		return this;
	}
	
public GroupsPage createGroup() {
		
		return this;
	}

}
