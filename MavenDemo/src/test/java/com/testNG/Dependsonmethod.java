package com.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependsonmethod {
	  @Test
	  public void login() {
		  
System.out.println("login");
}
	 
		  @Test(dependsOnMethods="login")
		  public void search() {
			  System.out.println("search");
			  Assert.assertEquals("abc", "xyz");
}
		  
			  @Test(dependsOnMethods="search",alwaysRun=true)
			  public void book() {
				  System.out.println("book");
}
}
