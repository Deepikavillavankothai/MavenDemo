package com.naukri;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Callwrapper {

	Wrappermethod wm = new Wrappermethod();
	@BeforeClass
	public void launchintoapp() {
		wm.launch("https://www.naukri.com/nlogin/login");
	}
	@Test
	public void login() {
		wm.clickbyxpath("//*[@id=\"login_Layer\"]/div");
		wm.enterbyid("usernameField", "adc");
		wm.enterbyid("passwordField", "adcf");
		wm.clickbyxpath("//*[@id=\"loginForm\"]/div[3]/div[3]/div/button[1]");
	}
		@AfterClass
		 public void screenshot() throws IOException {
			wm.takesnap("E:\\takescreen\\naukri.png");
			}
		
			public void close() {
				wm.closeapp();
	}
}
