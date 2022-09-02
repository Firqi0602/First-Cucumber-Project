package com.juaracoding.pageobject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.pageobject.drivers.DriverSingleton;

public class RegisterLoginAccount {
	private WebDriver driver;

	public RegisterLoginAccount() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
//  Create Account =====================================
	
	@FindBy(xpath = "//input[@id='email_create']")
	private WebElement txtEmail;
	
	@FindBy(xpath = "//span[normalize-space()='Create an account']")
	private WebElement btnCreate;
	
	@FindBy(xpath = "//input[@id='id_gender1']")
	private WebElement btnTitle;
	
	@FindBy(xpath = "//input[@id='customer_firstname']")
	private WebElement txtFirstName;
	
	@FindBy(xpath = "//input[@id='customer_lastname']")
	private WebElement txtLastName;
	
	@FindBy(xpath = "//input[@id='passwd']")
	private WebElement txtPassword;
	
	@FindBy(xpath = "//select[@id='days']")
	private WebElement btnTgl;
	
	@FindBy(xpath = "//*[@id=\"days\"]/option[32]")
	private WebElement clickTgl;
	
	@FindBy(xpath = "//select[@id='months']")
	private WebElement btnBln;
	
	@FindBy(xpath = "//*[@id=\"months\"]/option[4]")
	private WebElement clickBln;
	
	@FindBy(xpath = "//select[@id='years']")
	private WebElement btnThn;
	
	@FindBy(xpath = "//*[@id=\"years\"]/option[27]")
	private WebElement clickThn;
	
	@FindBy(xpath = "//input[@id='newsletter']")
	private WebElement radioNews;
	
	@FindBy(xpath = "//input[@id='optin']")
	private WebElement radioOption;
	
	@FindBy(xpath = "//input[@id='firstname']")
	private WebElement txtFirstNameAddress;
	
	@FindBy(xpath = "//input[@id='lastname']")
	private WebElement txtLastNameAddress;
	
	@FindBy(xpath = "//input[@id='company']")
	private WebElement txtCompany;
	
	@FindBy(xpath = "//input[@id='address1']")
	private WebElement txtAddress1;
	
	@FindBy(xpath = "//input[@id='address2']")
	private WebElement txtAddress2;
	
	@FindBy(xpath = "//input[@id='city']")
	private WebElement txtCity;
	
	@FindBy(xpath = "//select[@id='id_state']")
	private WebElement btnState;
	
	@FindBy(xpath = "//*[@id=\"id_state\"]/option[3]")
	private WebElement btnPilihState;
	
	@FindBy(xpath = "//input[@id='postcode']")
	private WebElement txtPostalCode;
	
	@FindBy(xpath = "//select[@id='id_country']")
	private WebElement btnCountry;
	
	@FindBy(xpath = "//*[@id=\"id_country\"]/option[2]")
	private WebElement btnPilihCountry;
	
	@FindBy(xpath = "//textarea[@id='other']")
	private WebElement txtAdditional;
	
	@FindBy(xpath = "//input[@id='phone']")
	private WebElement txtHomePhone;
	
	@FindBy(xpath = "//input[@id='phone_mobile']")
	private WebElement txtMobilePhone;
	
	@FindBy(xpath = "//input[@id='alias']")
	private WebElement txtAddressOptional;
	
	@FindBy(xpath = "//span[normalize-space()='Register']")
	private WebElement btnRegist;
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
	
	public void txtEmail() {
		txtEmail.sendKeys("nandiardana08@gmail.com");
	}
	
	public void btnCreate() {
		btnCreate.click();
	}
	
	public void btnTitle() {
		btnTitle.click();
	}
	  
	public void txtFirstName() {
		txtFirstName.sendKeys("Firqi");
	}
	
	public void txtLastName() {
		txtLastName.sendKeys("Nandi");
	}
	
	public void txtPassword() {
		txtPassword.sendKeys("firqi0602");
	}
	
	public void btnTgl() {
		btnTgl.click();
	}
	
	public void clickTgl() {
		clickTgl.click();
	}
	
	public void btnBln() {
		btnBln.click();
	}
	
	public void clickBln() {
		clickBln.click();
	}
	
	public void btnThn() {
		btnThn.click();
	}
	
	public void clickThn() {
		clickThn.click();
	}
	public void radioNews() {
		radioNews.click();
	}
	
	public void radioOption() {
		radioOption.click();
	}
	
	public void txtFirstNameAddress() {
		txtFirstNameAddress.sendKeys("Tegalrejo");
	}
	
	public void txtLastNameAddress() {
		txtLastNameAddress.sendKeys("Karangwarulor");
	}
	
	public void txtCompany() {
		txtCompany.sendKeys("PT. Tokopedia");
	}
	
	public void txtAddress1() {
		txtAddress1.sendKeys("Gang Kenanga");
	}
	
	public void txtAddress2() {
		txtAddress2.sendKeys("RT002/RW01");
	}
	
	public void txtCity() {
		txtCity.sendKeys("Yogyakarta");
	}
	
	public void btnState() {
		btnState.click();
	}
	
	public void btnPilihState() {
		btnPilihState.click();
	}
	
	public void txtPostalCode() {
		txtPostalCode.sendKeys("55244");
	}
	
	public void btnCountry() {
		btnCountry.click();
	}
	
	public void btnPilihCountry() {
		btnPilihCountry.click();
	}
	
	public void txtAdditional() {
		txtAdditional.sendKeys("Gang Kenanga Masuk, Rumah Kedua Gerbang Hijau");
	}
	
	public void txtHomePhone() {
		txtHomePhone.sendKeys("02198887722");
	}
	
	public void txtMobilePhone() {
		txtMobilePhone.sendKeys("085173012452");
	}
	
	public void txtAddressOptional() {
		txtAddressOptional.sendKeys("Kos Ibu Hariyani");
	}
	
	public void btnRegist() {
		btnRegist.click();
	}
}


