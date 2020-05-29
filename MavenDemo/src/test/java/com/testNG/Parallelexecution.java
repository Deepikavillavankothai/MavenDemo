package com.testNG;

import org.testng.annotations.Test;

public class Parallelexecution {
	
		  @Test
		  public void testcase1() {
			  
System.out.println("testcase1");
}
		 
			  @Test
			  public void testcase2() {
				  System.out.println("testcase2");
}
			  
				  @Test
				  public void testcase3() {
					  System.out.println("testcase3");
}
}