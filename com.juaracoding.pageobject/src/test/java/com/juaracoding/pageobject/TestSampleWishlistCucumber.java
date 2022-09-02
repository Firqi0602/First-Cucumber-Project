package com.juaracoding.pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
 
import com.juaracoding.pageobject.drivers.DriverSingleton;
import com.juaracoding.pageobject.pages.SampleWishlistCucumber;

public class TestSampleWishlistCucumber {
	public static WebDriver driver;
	private SampleWishlistCucumber sampleWishlistCucumber ;

	@BeforeClass
	public void setUp() {
		DriverSingleton.getInstance("Chrome");
		driver = DriverSingleton.getDriver();
		String url = "https://automationpractice.com/";
		driver.get(url);
	}

	@BeforeMethod
	public void pageObject() {
		sampleWishlistCucumber = new SampleWishlistCucumber();
	}
	 
	@Test
	public void testWishlist() {
		sampleWishlistCucumber.btnSearch();
		sampleWishlistCucumber.btnSearchProduct();
	}
	
	@Test
	public void testWishlist1() {
		scroll(500);
		sampleWishlistCucumber.cssPilih1();
		sampleWishlistCucumber.btnChart1();
		sampleWishlistCucumber.btnCloseChart1();
		sampleWishlistCucumber.cssPilih2();
		sampleWishlistCucumber.btnChart2();
		
	}

	@AfterClass
	public void closeBrowser() {
	delay(3);
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
		js.executeScript("window.scrollBy(0,"+vertical+")");
	}
}

