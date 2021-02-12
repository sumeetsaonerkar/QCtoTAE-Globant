package com.automationTest.pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import com.framework.exceptions.DriverNotInitializedException;
import com.framework.page.BasePage;
import com.framework.page.TestPage;

public class GoodreadsLandingPage extends BasePage implements TestPage {
	
	
	public GoodreadsLandingPage(WebDriver driver) throws DriverNotInitializedException {
		super(driver);
		
	}

	/*
	 * @FindBy(xpath="//a[@data-reactid='.2bly6fbvqps.1.0.2.0.0.0']") private
	 * WebElement Home;
	 * 
	 * @FindBy(xpath="//a[@data-reactid='.2bly6fbvqps.1.0.2.0.1.0']") private
	 * WebElement MyBooks;
	 */
	
	@FindBy(xpath="//div[@class='siteHeader__topLine gr-box gr-box--withShadow']//ul/li[3]/div")
	private WebElement Browse;
	
	@FindBy(xpath="//div[@class='siteHeader__topLine gr-box gr-box--withShadow']//ul/li[3]/div//ul[@class='siteHeader__subNav']/li[2]")
	private WebElement ChoiceAwards;
	
	@FindBy(xpath="//div[@class='siteHeader__topLine gr-box gr-box--withShadow']//ul/li[3]/div//ul[@class='siteHeader__subNav']/li[7]")
	private WebElement Explore;
	
	@FindBy(className="searchBox__input searchBox__input--navbar")
	private WebElement SearchBooks;
	
	@FindBy(xpath="//div[@class='dropdown dropdown--profileMenu']")
	private WebElement ClickProfileIcon;
	
	@FindBy(xpath="//div[@class='dropdown dropdown--profileMenu']/div/div/ul/li[13]")
	private WebElement SignOutLink;
	
	@FindBy(id="explore_search_query")
	private WebElement EnterBook;
	
	@FindBy(xpath="//div[@class='greyText fieldsToSearch']/input[@id='search_field_title']")
	private WebElement TitleClick;
	
	@FindBy(xpath="//input[@class='searchBox__button searchBox--large__button']")
	private WebElement Search;
	
	@FindBy(xpath="//span[text()='Emergency Skin']")
	private WebElement BookResults;
	
	@FindBy(xpath="//div[@class='siteHeader__topLine gr-box gr-box--withShadow']//a[text()='My Books']")
	private WebElement MyBooks;
	
	@FindBy(xpath="//div[@id='paginatedShelfList']/div[3]/a")
	private WebElement WantToRead;
	
	
	@FindBy(xpath="//div[@id='1_book_1633']/div[1]")
	private WebElement WantToReadButton;
	
	@FindBy(xpath="//a[text()='Recommend This Book']")
	private WebElement RecommendButton;
	
	@FindBy(xpath="//a[text()='Recommend']")
	private WebElement RecommendButton2;	

	@FindBy(xpath="//div[text()='Recommended']")
	private WebElement ConfirmationText;
		
	@FindBy(xpath="//a[text()='Sign in again']")
	private WebElement SignInAgainLink;
	
	@FindBy(xpath="//div[@id='toolsSection']/a[text()='Reading Challenge']")
	private WebElement ReadingChallengeLink;
	
	@FindBy(xpath="//div[@class='viewBooksHeader']/div")
	private WebElement ChallengeText;
	
	@FindBy(xpath="//div[@class='wtrRight wtrUp']")
	private WebElement WantToReadArrow;
	
	@FindBy(xpath="//button[@value='read']")
	private WebElement ReadValue;
	
	@FindBy(xpath="//span[text()='One Day at Horrorland (Goosebumps, #16)']")
	private WebElement BookFirst;
	
	@FindBy(xpath="//textarea[@id='review_review_usertext']")
	private WebElement EnterReviewBox;
		
	@FindBy(xpath="//input[@class='gr-button']")
	private WebElement PostReview;
	
	@FindBy(xpath="//div[@class='startedAtSetToday']/a")
	private WebElement DateStart;
	
	@FindBy(xpath="//div[@class='endedAtSetToday']/a")
	private WebElement DateFinish;

	
	@FindBys(@FindBy(xpath="//a[@class='bookCoverTarget']"))
	private List<WebElement> BookCount;
	
	
public GoodreadsLandingPage reviewSearchedBook() {
		
	
		Actions actions = new Actions(driver);
		actions.moveToElement(WantToReadArrow).perform();
		
		wait.until(ExpectedConditions.elementToBeClickable(ReadValue)).click();
		wait.until(ExpectedConditions.visibilityOf(EnterReviewBox)).sendKeys("nice book to read once");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,120)");
		
		wait.until(ExpectedConditions.visibilityOf(DateStart)).click();
		wait.until(ExpectedConditions.visibilityOf(DateFinish)).click();
		
		wait.until(ExpectedConditions.visibilityOf(PostReview)).click();
		
		return this;
	}
	
	public GoodreadsLandingPage readingChallenge(String bookname) {
		
		/*
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("window.scrollBy(0,250)");
		 */
		wait.until(ExpectedConditions.elementToBeClickable(MyBooks));
		MyBooks.click();
		wait.until(ExpectedConditions.visibilityOf(ReadingChallengeLink)).click();
		
		int oldBookCnt = BookCount.size();
		
		
		wait.until(ExpectedConditions.visibilityOf(ChallengeText));
		System.out.println("This was previous status of reading book challenge :- " + ChallengeText.getText());
		
		wait.until(ExpectedConditions.visibilityOf(Browse)).click();
		wait.until(ExpectedConditions.visibilityOf(Explore)).click();
		wait.until(ExpectedConditions.visibilityOf(TitleClick)).click();
		wait.until(ExpectedConditions.visibilityOf(EnterBook)).click();
		EnterBook.sendKeys(bookname);
		wait.until(ExpectedConditions.visibilityOf(Search)).click();
		//wait.until(ExpectedConditions.visibilityOf(BookResults)).click();
		wait.until(ExpectedConditions.visibilityOf(BookFirst)).click();
		
		Actions actions = new Actions(driver);
		actions.moveToElement(WantToReadArrow).perform();
		
		wait.until(ExpectedConditions.elementToBeClickable(ReadValue)).click();
		wait.until(ExpectedConditions.visibilityOf(EnterReviewBox)).sendKeys("nice book to read once");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,120)");
		
		wait.until(ExpectedConditions.visibilityOf(DateStart)).click();
		wait.until(ExpectedConditions.visibilityOf(DateFinish)).click();
		
		wait.until(ExpectedConditions.visibilityOf(PostReview)).click();
		
		wait.until(ExpectedConditions.visibilityOf(Browse));
		wait.until(ExpectedConditions.elementToBeClickable(MyBooks));
		MyBooks.click();
		wait.until(ExpectedConditions.visibilityOf(ReadingChallengeLink)).click();
		wait.until(ExpectedConditions.visibilityOf(ChallengeText));
		System.out.println("This was current status of reading book challenge :- " +ChallengeText.getText());
	//s	wait.until(ExpectedConditions.visibilityOf(BookCount));
		
		int newBookCnt = BookCount.size();
		
		Assert.assertEquals(newBookCnt, oldBookCnt+1);
		
		
		
		
		
		return this;
	}
	
public GoodreadsLandingPage readingChallengeAfter() {
		
		/*
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("window.scrollBy(0,250)");
		 */
		wait.until(ExpectedConditions.elementToBeClickable(MyBooks));
		MyBooks.click();
		wait.until(ExpectedConditions.visibilityOf(ReadingChallengeLink)).click();
		wait.until(ExpectedConditions.visibilityOf(ChallengeText));
		System.out.println("This was current status of reading book challenge :- " +ChallengeText.getText());
		wait.until(ExpectedConditions.visibilityOf((WebElement) BookCount));
		
		System.out.println(BookCount.size());
		
		return this;
	}
	
	
	
	
	public GoodreadsLandingPage sendRecommendation(String bookname) {
	
		
	String Actual = "Recommend"	;
	wait.until(ExpectedConditions.visibilityOf(Browse)).click();
	wait.until(ExpectedConditions.visibilityOf(Explore)).click();
	wait.until(ExpectedConditions.visibilityOf(TitleClick)).click();
	wait.until(ExpectedConditions.visibilityOf(EnterBook)).click();
	EnterBook.sendKeys(bookname);
	wait.until(ExpectedConditions.visibilityOf(Search)).click();
	wait.until(ExpectedConditions.visibilityOf(BookResults)).click();
//	wait.until(ExpectedConditions.visibilityOf(ClickFirstBook)).click();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,250)");
	wait.until(ExpectedConditions.visibilityOf(RecommendButton)).click();
	wait.until(ExpectedConditions.visibilityOf(RecommendButton2)).click();
	
	String msg = wait.until(ExpectedConditions.visibilityOf(RecommendButton2)).getText();
	System.out.println("book recommended to friend successfully -" + msg);
	Assert.assertEquals(Actual, msg);
	
	
	
		return this;
	}
	
	public GoodreadsLandingPage searchBook(String bookname) {
		
		wait.until(ExpectedConditions.visibilityOf(Browse)).click();
		wait.until(ExpectedConditions.visibilityOf(Explore)).click();
		wait.until(ExpectedConditions.visibilityOf(TitleClick)).click();
		wait.until(ExpectedConditions.visibilityOf(EnterBook)).click();
		EnterBook.sendKeys(bookname);
		wait.until(ExpectedConditions.visibilityOf(Search)).click();
		//wait.until(ExpectedConditions.visibilityOf(BookResults)).click();
		wait.until(ExpectedConditions.visibilityOf(BookFirst)).click();
		
		
		
			return this;
		}
	
	public GoodreadsLandingPage wantToReadButton()
	{
		wait.until(ExpectedConditions.visibilityOf(WantToReadButton)).click();
		return this;
	}
	
	
	
	
	
	public GoodreadsLandingPage signOut()
	{
		
		wait.until(ExpectedConditions.visibilityOf(ClickProfileIcon));
		ClickProfileIcon.click();
		wait.until(ExpectedConditions.visibilityOf(SignOutLink));
		SignOutLink.click();
		
		/*
		 * Boolean b =
		 * wait.until(ExpectedConditions.visibilityOf(SignInAgainLink)).isDisplayed();
		 * System.out.println(b);
		 */
		return this;
	}
	
	public boolean isSignInLinkDisplayed()
	{
		
		wait.until(ExpectedConditions.visibilityOf(SignInAgainLink));
		return SignInAgainLink.isDisplayed();
	}
	
	public GoodreadsLandingPage wantToRead(String bookname)
	{
		wait.until(ExpectedConditions.visibilityOf(MyBooks)).click();
		String actualText = WantToRead.getText();
		String a = actualText.replaceAll("[^0-9]", "");
		int oldNumber = Integer.parseInt(a);
		System.out.println("old count for want to read is :- " +oldNumber);
		wait.until(ExpectedConditions.visibilityOf(Browse)).click();
		wait.until(ExpectedConditions.visibilityOf(Explore)).click();
		wait.until(ExpectedConditions.visibilityOf(TitleClick)).click();
		wait.until(ExpectedConditions.visibilityOf(EnterBook)).click();
		EnterBook.sendKeys(bookname);
		wait.until(ExpectedConditions.visibilityOf(Search)).click();
		//wait.until(ExpectedConditions.visibilityOf(BookResults)).click();
		wait.until(ExpectedConditions.visibilityOf(WantToReadButton)).click();
		wait.until(ExpectedConditions.visibilityOf(MyBooks)).click();
		String expText = WantToRead.getText();
		String b = expText.replaceAll("[^0-9]", "");
		int newNumber = Integer.parseInt(b);
		System.out.println("new count for want to read is :- " +newNumber);
		Assert.assertEquals(newNumber, oldNumber+1);
		
		
		
		
		return this;
	}
	
	


		
		
	
	
}
