package com.automationTest.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

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
	
	@FindBy(xpath="//span[text()='Getting Things Done: The Art of Stress-Free Productivity']")
	private WebElement BookResults;
	
	@FindBy(xpath="//div[@class='siteHeader__topLine gr-box gr-box--withShadow']//ul/li[2]//a[text()='My Books']")
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
	
	
	
	public GoodreadsLandingPage sendRecommendation(String bookname) {
		
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
	System.out.println("book recommended to friend successfully" + msg);
	
	
		return this;
	}
	
	public GoodreadsLandingPage searchBook(String bookname) {
		
		wait.until(ExpectedConditions.visibilityOf(Browse)).click();
		wait.until(ExpectedConditions.visibilityOf(Explore)).click();
		wait.until(ExpectedConditions.visibilityOf(TitleClick)).click();
		wait.until(ExpectedConditions.visibilityOf(EnterBook)).click();
		EnterBook.sendKeys(bookname);
		wait.until(ExpectedConditions.visibilityOf(Search)).click();
		wait.until(ExpectedConditions.visibilityOf(BookResults)).click();
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
		String abc = WantToRead.getText();
		String a = abc.replaceAll("[^0-9]", "");
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
		String xyz = WantToRead.getText();
		String b = xyz.replaceAll("[^0-9]", "");
		int newNumber = Integer.parseInt(b);
		System.out.println("new count for want to read is :- " +newNumber);
		
		
		return this;
	}
	
	


		
		
	
	
}
