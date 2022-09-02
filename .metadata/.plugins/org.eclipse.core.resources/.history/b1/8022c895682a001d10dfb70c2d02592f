package com.juaracoding.pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.juaracoding.pageobject.pages.SampleWishlist;
import com.juaracoding.pageobject.pages.LoginAccount;

import com.juaracoding.pageobject.drivers.DriverSingleton;

public class TestCheckOut {

	public static WebDriver driver;
	private LoginAccount loginAccount;
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
		loginAccount = new LoginAccount();
		sampleWishlist = new SampleWishlist();
	}

	@Test(priority = 1)
	public void testLogin() {
		loginAccount.txtEmailLogin();
		loginAccount.txtPassLogin();
		loginAccount.btnLogin();
			System.out.println("My Account");
	}
//
//	=======================Test Checkout ====================
//	
	@Test(priority = 2)
	public void testWishlist() {
		delay(3);
		sampleWishlist.btnTxtSearch();
		sampleWishlist.txtSearch();
		sampleWishlist.btnSearch();
			System.out.println("Looking for printed dress");
	}

	@Test(priority = 3)
	public void testWishlist1() {
		scroll(450);
		sampleWishlist.cssPilih1();
		sampleWishlist.btnChart1();
		sampleWishlist.btnCloseChart1();
		delay(15);
		sampleWishlist.cssPilih2();
		sampleWishlist.btnChart2();
		sampleWishlist.btnCheckOut();
		scroll(450);
		delay(15);
		scroll(500);
			System.out.println("2 Item Checkout View");
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
