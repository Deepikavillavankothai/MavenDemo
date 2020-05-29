package com.testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Orangehrm {
	WebDriver driver;

	@BeforeClass
	public void launch() {
System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");

		
	}
	@Test
	public void login() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
	}
	@Test
	public void admin() {
		driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']/b")).click();
	}

	@Test
	public void username() {
	
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys("anna.john");
	}
	
	
		
	
	
	
	
	
	
	

}
