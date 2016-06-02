package com.xebia.xke.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	WebDriver driver;
	@Test()
	@Parameters("browserType")
	public void testMethod(@Optional("firefox") String browser) throws InterruptedException {
		System.out.println("browser value from xml file is : "+browser);
		switch (browser) {
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "/Users/hema/XEBIA/Xebia_Projects/Projects/git/Tribune/src/main/resources/drivers/chromedriver");
			driver = new ChromeDriver();
			break;
		default:
			System.out.println("no Browser mentioned");
			break;
		}
		
		driver.get("http://google.com/");
		Thread.sleep(2000);

	}
}
