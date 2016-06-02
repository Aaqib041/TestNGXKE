package com.xebia.xke.testNG;

import org.testng.annotations.Test;

public class ParallelExecSample {
	@Test
	public void parallelTest() throws InterruptedException {
		for (int i = 0; i < 1000; i++) {
			System.out.println("Executing Thread : "+Thread.currentThread().getId());
			Thread.sleep(2000);
		}
	}
}