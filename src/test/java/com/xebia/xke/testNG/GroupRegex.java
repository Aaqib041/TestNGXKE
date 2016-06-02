package com.xebia.xke.testNG;

import org.testng.annotations.Test;

public class GroupRegex {
	@Test
	public class Test1 {
	  @Test(groups =  "windows.grp1" )
	  public void testWindowsOnly() {
		  System.out.println("Inside windows.grp1");
	  }
	 
	  @Test(groups = "linux.grp1" )
	  public void testLinuxOnly() {
		  System.out.println("Inside Linux.grp1");
	  }
	 
	  @Test(groups =  "windows.grp2" )
	  public void testWindowsToo() {
		  System.out.println("Inside Windows.grp2");
	  }
	}

}
