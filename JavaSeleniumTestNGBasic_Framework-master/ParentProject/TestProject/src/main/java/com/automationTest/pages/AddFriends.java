package com.automationTest.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.framework.exceptions.DriverNotInitializedException;
import com.framework.page.BasePage;
import com.framework.page.TestPage;


public class AddFriends extends BasePage implements TestPage {
	
	public AddFriends(WebDriver driver) throws DriverNotInitializedException {
		super(driver);
		
	}


	@FindBy(xpath="//div[@class='dropdown dropdown--profileMenu']")
	private WebElement UserprofileIcon;
	
	@FindBy(xpath="//div[@class='dropdown dropdown--profileMenu']/div/div/ul/li[2]")
	private WebElement Friends;
	
	@FindBy(id="inviteLink")
	private WebElement AddFriends;
	
	@FindBy(xpath="//input[@class='gr-form--compact__input']")
	private WebElement EnterFriendName;
	
	@FindBy(xpath="//input[@value='search members']")
	private WebElement SearchButton;
	
	@FindBy(xpath="//a[text()='Add as a Friend']")
	private WebElement InviteFriendButton;
	
	
	
	
	public AddFriends inviteFriends(String friendEmailID) {
		
		wait.until(ExpectedConditions.visibilityOf(UserprofileIcon));
		UserprofileIcon.click();
		wait.until(ExpectedConditions.visibilityOf(Friends));
		Friends.click();
		wait.until(ExpectedConditions.visibilityOf(AddFriends));
		AddFriends.click();
		wait.until(ExpectedConditions.visibilityOf(EnterFriendName));
		EnterFriendName.click();
		EnterFriendName.sendKeys(friendEmailID);
		wait.until(ExpectedConditions.visibilityOf(SearchButton));
		SearchButton.click();
		HiddenElement().InviteFriendButton.click();
				return this;
	}
	
	public AddFriends HiddenElement()
	{
		
		JavascriptExecutor js = (JavascriptExecutor)driver;  
		js.executeScript("arguments[0].click()",InviteFriendButton);
		return this;
	}
	
	
	public AddFriends hiddenAdd()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;  
		js.executeScript("arguments[0].click()");
		return this;
	}

	
	

}
