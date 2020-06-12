package com.ProjectName.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
	
	WebDriver ldriver;
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(name="email")
	WebElement textEmail;
	
	@FindBy(name="pass")
	WebElement textPassword;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/table[1]/tbody[1]/tr[2]/td[3]/label[1]/input[1]")
	WebElement btnLogin;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/span[1]/div[1]/div[1]/img[1]")
	WebElement dropDownAccount;
	
	public void setEmail(String email)
	{
		//textEmail.clear();
		textEmail.sendKeys(email);
	}
	public void setPassword(String pass)
	{
		textPassword.clear();
		textPassword.sendKeys(pass);
	}
	public void clicklogin()
	{
		btnLogin.click();
	}
	
	public void clickLogout()
	{
		dropDownAccount.click();
		Select s=new Select(dropDownAccount);
		s.selectByVisibleText("Log Out");
	}
	

}
