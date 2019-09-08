package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.basetest.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(xpath="//span[contains(text(),'Hello. Sign in')]")
	WebElement signin;
	
	@FindBy(id="ap_email")
	WebElement email;
	
	@FindBy(id="continue")
	WebElement continue_button;
	
	@FindBy(id="ap_password")
	WebElement password;
	
	@FindBy(id="signInSubmit")
	WebElement login;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Sign_In_and_Email_Feature(String uname)
	{
		signin.click();
		email.sendKeys(uname);
		continue_button.click();
	}
	
	public HomePage Password_and_Login_Feature(String pwd)
	{
		password.sendKeys(pwd);
		login.click();
		
		return new HomePage();
	}
	
	public String HomePage_Title_Feature()
	{
		return driver.getTitle();
	}
}
