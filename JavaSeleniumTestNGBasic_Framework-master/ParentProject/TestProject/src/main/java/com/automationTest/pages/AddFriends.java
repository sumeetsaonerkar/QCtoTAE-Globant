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
	private WebElement SearchMemberButton;
	
	@FindBy(xpath="//input[@class='button smallButton']")
	private WebElement InviteFriendButton;
	
	
	@FindBy(xpath="//div[contains(text(),'Your invite was sent to')]")
	private WebElement SnacksBarMsg;
	
	
	@FindBy(xpath="//span[@class='greyText']")
	private WebElement ReqDetails;
	
	@FindBy(xpath="//div[contains(text(),'Your invite was sent to')]")
	private WebElement InviteFrndSnacksBarMsg;
	
	
	
	
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
		wait.until(ExpectedConditions.visibilityOf(SearchMemberButton));
		SearchMemberButton.click();
		HiddenElement();
		wait.until(ExpectedConditions.visibilityOf(InviteFrndSnacksBarMsg));
		System.out.println(InviteFrndSnacksBarMsg.getText());
		
		System.out.println(InviteFrndSnacksBarMsg.isDisplayed());
		
		
		/*
		 * wait.until(ExpectedConditions.visibilityOf(ReqDetails));
		 * System.out.println("status of friend request : -" + ReqDetails.getText());
		 * 
		 * 
		 * 
		 * wait.until(ExpectedConditions.visibilityOf(SnacksBarMsg));
		 * System.out.println(SnacksBarMsg.getText());
		 */
		 
		// work for pending request
		
		
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
