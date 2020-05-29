package com.testcase;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangehrmMaven {

	public static void main(String[] args) throws IOException {
System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[5]/a")).click();
		driver.findElement(By.id("menu_recruitment_viewCandidates")).click();
   driver.findElement(By.xpath("//*[contains(@name,'candidateSearch[status]')]")).sendKeys("INTERVIEW SCHEDULED");
		driver.findElement(By.xpath("//*[@id='candidateSearch_fromDate']")).click();
		 driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/select[2]")).click();
		 
		 driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[1]/a")).click();
		 driver.findElement(By.xpath("//*[@id='candidateSearch_toDate']")).click();
		 driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[2]/span")).click();
		 driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[1]/td[3]/a")).click();
		 TakesScreenshot ts =(TakesScreenshot)driver;
	       File source = ts.getScreenshotAs(OutputType.FILE);
	       FileUtils.copyFile(source,new File(("E:\\takescreen\\file.png")));


		

		 
	}

}
