package com.xebia.xke.testNG;

import org.testng.annotations.Test;

@Test
public class ClassLevelAnnotation {
	
	public void testMethod1() {
	System.out.println("Inside first method");
	}
	
	public void testMethod2() {
		System.out.println("Inside second method");
	}
	
	public void testMethod3() {
		System.out.println("Inside third method");
	}
	
	public void testMethod4() {
		System.out.println("Inside fourth method");
	}
	
	private void testMethod5() {
		System.out.println("Inside fifth method");
	}
}