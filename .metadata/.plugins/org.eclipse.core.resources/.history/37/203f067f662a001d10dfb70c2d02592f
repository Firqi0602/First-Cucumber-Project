package com.juaracoding.pageobject.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.pageobject.drivers.DriverSingleton;

public class LoginAccount {

	private WebDriver driver;

	public LoginAccount() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
//	
//	======================= Login ====================
//	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement txtEmailLogin;
	
	@FindBy(xpath = "//input[@id='passwd']")
	private WebElement txtPassLogin;
	
	@FindBy(xpath = "//span[normalize-space()='Sign in']")
	private WebElement btnLogin;
//	
//	======================= Login ====================
//	
	public void txtEmailLogin() {
		txtEmailLogin.sendKeys("nandiardana08@gmail.com");
	}
	
	public void txtPassLogin() {
		txtPassLogin.sendKeys("firqi0602");
	}
	
	public void btnLogin() {
		btnLogin.click();
	}
	

	}

