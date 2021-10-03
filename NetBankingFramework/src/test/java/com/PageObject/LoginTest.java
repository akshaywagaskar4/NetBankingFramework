package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginTest {
	
	WebDriver driver;
	
	@FindBy(name="uid")
	private WebElement username1;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(name="btnLogin")
	private WebElement loginbtn;
	
	public LoginTest(WebDriver driver) {
		//this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void setusername(String user) {
		username1.sendKeys(user);
	}
	public void setPassword(String pass) {
		password.sendKeys(pass);
	}
	public void setlogin() {
		loginbtn.click();
	}

}
