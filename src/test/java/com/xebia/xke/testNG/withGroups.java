package com.xebia.xke.testNG;

import org.testng.annotations.Test;


public class withGroups {
	@Test(groups = { "group1", "group2" })
	public void first() {
	System.out.println("Inside first method");
	}
	@Test(groups = "group1")
	public void second() {
		System.out.println("Inside second method");
	}
	@Test(groups = "group2")
	public void third() {
		System.out.println("Inside third method");
	}
	@Test
	public void fourth() {
		System.out.println("Inside fourth method");
	}
	@Test
	public void fifth() {
		System.out.println("Inside fifth method");
	}
}