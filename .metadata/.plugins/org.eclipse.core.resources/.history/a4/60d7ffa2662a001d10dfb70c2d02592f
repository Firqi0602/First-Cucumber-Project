package com.juaracoding.pageobject;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.MouseAction;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.juaracoding.pageobject.pages.SampleWishlist;
import com.juaracoding.pageobject.drivers.DriverSingleton;


	public class TestSampleWishlist {

		public static WebDriver driver;
		private SampleWishlist sampleWishlist ;

		@BeforeClass
		public void setUp() {
			DriverSingleton.getInstance("Chrome");
			driver = DriverSingleton.getDriver();
			String url = "https://automationpractice.com/";
			driver.get(url);
		}

		@BeforeMethod
		public void pageObject() {
			sampleWishlist = new SampleWishlist();
		}
		
		@Test
		public void testWishlist() {
			sampleWishlist.btnTxtSearch();
			sampleWishlist.txtSearch();
			sampleWishlist.btnSearch();
		}
		
		@Test
		public void testWishlist1() {
			scroll(500);
			sampleWishlist.cssPilih1();
			sampleWishlist.btnChart1();
			sampleWishlist.btnCloseChart1();
			sampleWishlist.cssPilih2();
			sampleWishlist.btnChart2();
			
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

