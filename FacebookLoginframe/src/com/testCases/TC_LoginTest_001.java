package com.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	
	@Test
	public void loginTest() throws IOException 
	{
		
		LoginPage lp = new LoginPage(driver);
		lp.setusername(username);
		lp.setPassword(password);
		lp.clickLogin();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		System.out.println(driver.getTitle());
		if(driver.getTitle().equals("Facebook")) {
			Assert.assertTrue(true);
			
		}
		else {
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
		}
		
	}

}
