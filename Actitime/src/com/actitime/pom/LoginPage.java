package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="username")
	private WebElement unTbx;
	
	@FindBy(name="pwd")
	private WebElement pwTbx;

	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginBtn;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getUnTbx() {
		return unTbx;
	}

	public WebElement getPwTbx() {
		return pwTbx;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	
}
