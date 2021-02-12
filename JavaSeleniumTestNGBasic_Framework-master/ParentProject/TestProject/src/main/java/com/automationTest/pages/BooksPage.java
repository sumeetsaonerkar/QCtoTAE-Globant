package com.automationTest.pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.framework.exceptions.DriverNotInitializedException;
import com.framework.page.BasePage;
import com.framework.page.TestPage;

public class BooksPage extends BasePage implements TestPage {

	public BooksPage(WebDriver driver) throws DriverNotInitializedException {
		super(driver);
		
	}
	
	@FindBy(xpath="//div[@class='siteHeader__topLine gr-box gr-box--withShadow']//ul/li[2]//a[text()='My Books']")
	private WebElement MyBooks;
	
	@FindBys(@FindBy(xpath="//select[@id='per_page']"))
	private WebElement PagesElements;
	
	@FindBys(@FindBy(xpath="//select[@id='sort']/option"))
	private List<WebElement> SortElements;
	
	@FindBy(xpath="//select[@id='sort']/option")
	private WebElement SecondOption;
	
	@FindBys(@FindBy(xpath="//table[@id='books']//tr"))
	private List<WebElement> BooksList;
	
	public BooksPage verifySort() {
		
		wait.until(ExpectedConditions.visibilityOf(MyBooks)).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		Select selectPages = new Select(PagesElements);
		selectPages.selectByIndex(2);
		
		int pageNo = 30;
		
		int pageCount = BooksList.size();
		
		Assert.assertEquals(pageNo, pageCount-1);
		
		return this;
	}
}
