package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewAccount {
	
	WebDriver driver;
	
	@FindBy(xpath="//a[text()='New Account']")
	private WebElement newAccountTab;
	
	@FindBy(name="cusid")
	private WebElement customerId;
	
	@FindBy(name="selaccount")
	private WebElement selectAccountType;
	
	

}
