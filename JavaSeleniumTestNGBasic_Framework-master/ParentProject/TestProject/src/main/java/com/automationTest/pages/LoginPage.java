package com.automationTest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.framework.exceptions.DriverNotInitializedException;
import com.framework.page.BasePage;
import com.framework.page.TestPage;

public class LoginPage extends BasePage implements TestPage {
	
	
	public LoginPage(WebDriver driver) throws DriverNotInitializedException {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id="userSignInFormEmail")
	private WebElement UserID;

	@FindBy(xpath="//div[@id='signInForm']//div[2]//input[@name='user[password]']")
	private WebElement UserPwd; 
	
	@FindBy(xpath="//input[@value='Sign in']")
	private WebElement SignIn;
	
	@FindBy(id="user_first_name")
	private WebElement RegisterName;
	
	@FindBy(id="user_email")
	private WebElement RegisterEmail;
	
	@FindBy(id="user_password_signup")
	private WebElement RegisterPwd;
	
	@FindBy(xpath="//input[@value='Sign up']")
	private WebElement ClickSignupButton;
	
	@FindBy(xpath="//li[@data-reactid='.jp716rslq8.1.0.4.0.4']")
	private WebElement ClickProfileIcon;
	
	@FindBy(xpath="//span[@data-reactid='.1xgo1lxdo1s.1.0.4.0.4.0.1.0.0.1']")
	private WebElement ProfileName;
	
	@FindBy(xpath="//div[@class='genres_form']")
	private WebElement GenresList;
	
	@FindBy(xpath="//li[@data-reactid='.jp716rslq8.1.0.4.0.4.0.1.0.1.9']")
	private WebElement FavouriteGenres;
	
	
	
	public LoginPage enterUsername(String username) {
		
		wait.until(ExpectedConditions.visibilityOf(UserID));
		UserID.click();
		UserID.sendKeys(username);
		return this;
	}
	

	public LoginPage enterPasword(String pwd) {
		
		wait.until(ExpectedConditions.visibilityOf(UserID));
		UserPwd.click();
		UserPwd.sendKeys(pwd);
		return this;
	}
	

	public LoginPage clickLoginButton() {
		
		wait.until(ExpectedConditions.visibilityOf(SignIn));
		SignIn.click();
		return this;
	}
	
	public LoginPage enterNameToRegister(String rName) {
	
		wait.until(ExpectedConditions.visibilityOf(RegisterName));
		RegisterName.click();
		RegisterName.sendKeys(rName);
		return this;
		
	}
	
	public LoginPage enterPwdToRegister(String rPwd) {
		
		wait.until(ExpectedConditions.visibilityOf(RegisterPwd));
		RegisterPwd.click();
		RegisterPwd.sendKeys(rPwd);
		return this;
	}
	
	public LoginPage enterEmailToRegister(String rEmail) {
		
		wait.until(ExpectedConditions.visibilityOf(RegisterEmail));
		RegisterEmail.click();
		RegisterEmail.sendKeys(rEmail);
		return this;
	}
	
	public LoginPage clickToSignUp() {
		
		wait.until(ExpectedConditions.visibilityOf(ClickSignupButton));
		ClickSignupButton.click();
		return this;
	}
	
	public String verifyLogin() {
		wait.until(ExpectedConditions.visibilityOf(ClickProfileIcon));
		ClickProfileIcon.click();
		String profileName = ProfileName.getText();
		
		return profileName;
	}
	
	public LoginPage verifyGenres() { 
		
		wait.until(ExpectedConditions.visibilityOf(ClickProfileIcon));
		ClickProfileIcon.click();
		wait.until(ExpectedConditions.visibilityOf(FavouriteGenres));
		FavouriteGenres.click();
		wait.until(ExpectedConditions.visibilityOf(GenresList));
		
		return this;
	
	}
	 
	
	

}
