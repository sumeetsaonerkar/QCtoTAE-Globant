package com.automationTest.operations;




import com.automationTest.pages.AddFriends;
import com.automationTest.pages.GoodreadsLandingPage;
import com.automationTest.pages.LoginPage;
import com.framework.exceptions.DriverNotInitializedException;
import com.framework.operation.IOperations;
import com.framework.page.TestPageFactory;

public class GoodReadsLogin implements IOperations {
	
	LoginPage loginPage;
	GoodreadsLandingPage goodReadsLandingPage;
	AddFriends addFriends;
	
	
	public void loginOperations(String Uname, String Upwd) throws DriverNotInitializedException {
		
		loginPage = TestPageFactory.getPage(LoginPage.class)
				.enterUsername(Uname)
				.enterPasword(Upwd)
				.clickLoginButton();
		
		
	}
	
	public void signUpOperations(String regName, String regEmail, String regPwd) throws DriverNotInitializedException {
		
		loginPage = TestPageFactory.getPage(LoginPage.class).enterNameToRegister(regName)
				.enterEmailToRegister(regEmail)
				.enterPwdToRegister(regPwd)
				.clickToSignUp();
		
	}
	
	public void signOut() throws DriverNotInitializedException
	{
		goodReadsLandingPage = TestPageFactory.getPage(GoodreadsLandingPage.class).signOut();
	}
	
	public void awardsOperation() throws DriverNotInitializedException {
		
		
		goodReadsLandingPage = TestPageFactory.getPage(GoodreadsLandingPage.class).awardssss();
		
	}

	public void friend(String friendEmailID) throws DriverNotInitializedException {
		
		addFriends = TestPageFactory.getPage(AddFriends.class).inviteFriends(friendEmailID);
		
	}

}