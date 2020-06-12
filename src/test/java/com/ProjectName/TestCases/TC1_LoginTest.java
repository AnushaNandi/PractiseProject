package com.ProjectName.TestCases;

import org.testng.annotations.Test;

import com.ProjectName.baseClass.BaseClass;
import com.ProjectName.pageObjects.LoginPage;

public class TC1_LoginTest extends BaseClass{
	
	@Test
	public void loginTest() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		Thread.sleep(1000);
		lp.setEmail("anushavani@yahoo.com");
		logger.info("Email id is entered");
		lp.setPassword("saiHA369");
		logger.info("password is entered");
		lp.clicklogin();
		logger.info("clicked login");
		Thread.sleep(2000);
		//lp.clickLogout();
		//logger.info("clicked logout");
	}

}
