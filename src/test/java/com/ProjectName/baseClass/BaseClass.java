package com.ProjectName.baseClass;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;


public class BaseClass {
	
	public WebDriver driver;
	public Logger logger;
	@BeforeClass
	@Parameters("browser")
	public void setup(String br)
	{
	    logger=Logger.getLogger("Facebook");
	    PropertyConfigurator.configure("log4j.properties");
		if(br.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		}
		else if(br.equals("firefox"))
		{
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/Drivers/geckodriver.exe");
		driver=new FirefoxDriver();	
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20l, TimeUnit.SECONDS);
		logger.info("Opened Browser");
		driver.get("http://www.facebook.com");
		logger.info("Opened the AUT page");
	}
	@AfterClass
	public void teardown()
	{
		driver.quit();
		logger.info("Closed browser");
	}

}
