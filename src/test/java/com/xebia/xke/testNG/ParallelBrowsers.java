package com.xebia.xke.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelBrowsers {
	@Test
	public void testLogic() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("lst-ib")).sendKeys("XEBIA Bangalore");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@value='Search']")).click();
	}
}
