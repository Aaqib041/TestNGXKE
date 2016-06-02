package com.xebia.xke.testNG;

import org.testng.annotations.Test;


public class Priority {
	@Test(priority = 0)
	public void first() {
	System.out.println("Inside first method");
	}
	@Test(priority = 1)
	public void second() {
		System.out.println("Inside second method");
	}
	@Test(priority = 2)
	public void third() {
		System.out.println("Inside third method");
	}
	@Test(priority = 3)
	public void fourth() {
		System.out.println("Inside fourth method");
	}
	@Test(priority = 4)
	public void fifth() {
		System.out.println("Inside fifth method");
	}
}