package com.xebia.xke.testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametrarization {
	
	@Test
	@Parameters("sampleParameter")
	public void method1(String param) {
		System.out.println("Inside Method");
		System.out.println("Parameter value is "+param);

}
}
