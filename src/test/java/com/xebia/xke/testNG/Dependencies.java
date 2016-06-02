package com.xebia.xke.testNG;

import org.testng.annotations.Test;

public class Dependencies {
	@Test
	public void tpreCondition() {
		System.out.println("Executing Precondition for test case");
	}
	@Test (dependsOnMethods = "tpreCondition")
	public void testCaseLogic() {
		System.out.println("Executing the test case logic");

	}
}
