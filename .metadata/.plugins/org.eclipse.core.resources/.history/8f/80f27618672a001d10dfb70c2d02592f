package com.juaracoding.pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.juaracoding.pageobject.drivers.DriverSingleton;
import com.juaracoding.pageobject.pages.RegisterLoginAccount;
import com.juaracoding.pageobject.pages.SampleWishlist;

public class TestCheckOutRegisterLogin {

	public static WebDriver driver;
	private RegisterLoginAccount registerLoginAccount;
	private SampleWishlist sampleWishlist;


	@BeforeClass
	public void setUp() {
		DriverSingleton.getInstance("Chrome");
		driver = DriverSingleton.getDriver();
		String url = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
		driver.get(url);
	}

	@BeforeMethod
	public void pageObject() {
		registerLoginAccount = new RegisterLoginAccount();
		sampleWishlist = new SampleWishlist();
	}

// Membuat akun
	
	@Test(priority = 1)
	public void testBuatAkun() {
		registerLoginAccount.txtEmail();
		registerLoginAccount.btnCreate();
	}
 
	@Test(priority = 2)
	public void testIsiBiodata() {
		delay(5);
		registerLoginAccount.btnTitle();
		registerLoginAccount.txtFirstName();
		registerLoginAccount.txtLastName();
		registerLoginAccount.txtPassword();
		registerLoginAccount.btnTgl();
		registerLoginAccount.clickTgl();
		registerLoginAccount.btnBln();
		registerLoginAccount.clickBln();
		registerLoginAccount.btnThn();
		registerLoginAccount.clickThn();
		registerLoginAccount.radioNews();
		registerLoginAccount.radioOption();
		registerLoginAccount.txtFirstNameAddress();
		registerLoginAccount.txtLastNameAddress();
		registerLoginAccount.txtCompany();
		registerLoginAccount.txtAddress1();
		registerLoginAccount.txtAddress2();
		registerLoginAccount.txtCity();
		registerLoginAccount.btnState();
		registerLoginAccount.btnPilihState();
		registerLoginAccount.txtPostalCode();
		registerLoginAccount.btnCountry();
		registerLoginAccount.btnPilihCountry();
		registerLoginAccount.txtAdditional();
		registerLoginAccount.txtHomePhone();
		registerLoginAccount.txtMobilePhone();
		registerLoginAccount.txtAddressOptional();
		registerLoginAccount.btnRegist();
			System.out.println("Kamu Berhasil Buat Akun");
	}
//	
//	=======================Test Login ====================
//	
	@Test(priority = 3)
	public void testLogin() {
		registerLoginAccount.txtEmailLogin();
		registerLoginAccount.txtPassLogin();
		registerLoginAccount.btnLogin();
			System.out.println("Kamu Berhasil Login");
	}
//
//	=======================Test Checkout ====================
//	
	@Test(priority = 4)
	public void testWishlist() {
		delay(3);
		sampleWishlist.btnTxtSearch();
		sampleWishlist.txtSearch();
		sampleWishlist.btnSearch();
			System.out.println("Pencarian printed dress");
	}

	@Test(priority = 5)
	public void testWishlist1() {
		scroll(450);
		sampleWishlist.cssPilih1();
		sampleWishlist.btnChart1();
		sampleWishlist.btnCloseChart1();
		delay(15);
		sampleWishlist.cssPilih2();
		sampleWishlist.btnChart2();
		sampleWishlist.btnCheckOut();
		scroll(800);
		delay(15);
			System.out.println("Tampilan Checkout 2 Item");
	}

	@AfterClass
	public void closeBrowser() {
		delay(15);
		driver.quit();
	}

	static void delay(int detik) {
		try {
			Thread.sleep(1000 * detik);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	static void scroll(int vertical) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0," + vertical + ")");
	}
}


