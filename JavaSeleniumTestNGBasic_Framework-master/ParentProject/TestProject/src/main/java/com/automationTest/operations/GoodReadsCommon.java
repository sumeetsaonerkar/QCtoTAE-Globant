package com.automationTest.operations;

import com.automationTest.pages.AddFriends;
import com.automationTest.pages.AwardsPage;
import com.automationTest.pages.BooksPage;
import com.automationTest.pages.Explore;
import com.automationTest.pages.GenrePage;
import com.automationTest.pages.GoodreadsLandingPage;
import com.automationTest.pages.GroupsPage;
import com.automationTest.pages.LoginPage;
import com.automationTest.pages.ReadPage;
import com.framework.exceptions.DriverNotInitializedException;
import com.framework.operation.IOperations;
import com.framework.page.TestPageFactory;

public class GoodReadsCommon implements IOperations {
	
	LoginPage loginPage;
	GoodreadsLandingPage goodReadsLandingPage;
	AddFriends addFriends;
	Explore explore;
	GroupsPage groupsPage;
	ReadPage readPage;
	AwardsPage awards;
	BooksPage booksPage;
	GenrePage genrePage;
	
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
	
	public boolean isLink()
	{
		return goodReadsLandingPage.isSignInLinkDisplayed();
	}
	
	public void awardsOperation() throws DriverNotInitializedException {
		
		
		awards = TestPageFactory.getPage(AwardsPage.class).awardssss();
		
	}

	public void friend(String friendEmailID) throws DriverNotInitializedException {
		
		addFriends = TestPageFactory.getPage(AddFriends.class).inviteFriends(friendEmailID);
		
	}

	public void book(String bookname) throws DriverNotInitializedException {
		
		goodReadsLandingPage = TestPageFactory.getPage(GoodreadsLandingPage.class).sendRecommendation(bookname);
	}
	
	public void groupNameChange(String groupame) throws DriverNotInitializedException {
		
		groupsPage = TestPageFactory.getPage(GroupsPage.class).editGroup(groupame);
		
	}
	
	public void wantToReadCount(String searchBook) throws DriverNotInitializedException {
		
		goodReadsLandingPage = TestPageFactory.getPage(GoodreadsLandingPage.class).wantToRead(searchBook);
	}
	
	public void sortBooks() throws DriverNotInitializedException {
		
		booksPage = TestPageFactory.getPage(BooksPage.class).verifySort();
	}
	
	public void challenge(String bookname) throws DriverNotInitializedException {
		
		goodReadsLandingPage = TestPageFactory.getPage(GoodreadsLandingPage.class).readingChallengeBefore()
				.searchBook(bookname)
				.reviewSearchedBook()
				.readingChallengeAfter();
	}
	
public void checkGenreOperation() throws DriverNotInitializedException {
		
	genrePage = TestPageFactory.getPage(GenrePage.class).verifyGenreFunctionality();
	
	}
	
	
}
