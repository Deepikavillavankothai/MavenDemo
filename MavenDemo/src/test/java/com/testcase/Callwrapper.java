package com.testcase;

import java.io.IOException;

public class Callwrapper {

	public static void main(String[] args) throws IOException {
		Wrappermethods wm = new Wrappermethods();
		wm.insertapp("https://www.facebook.com/");
		wm.enterbyid("email", "adc@gmail.com");
		wm.enterbyid("pass", "adcf");
		wm.clickbyxpath("//*[@id='u_0_b']");
		wm.takesnap("E:\\takescreen\\file1.png");
		wm.closeapp();
		

	}

}
