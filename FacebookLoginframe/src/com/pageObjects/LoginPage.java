package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver ldriver;
    
    public LoginPage(WebDriver rdriver)
    {
    	ldriver=rdriver;
    	PageFactory.initElements(rdriver,this);
    } 
    
   @FindBy(name="email")
   WebElement txtUserName;
   
   @FindBy(name="pass")
   WebElement Password;
   
   @FindBy(name="login")
   WebElement btnLogin;
   
   public void setusername(String uname) 
   {
	   txtUserName.sendKeys(uname);   
   }
   
   public void setPassword(String pwd) 
   {
	   Password.sendKeys(pwd);   
   }
   
   public void clickLogin()
   {
	   btnLogin.click();   
   }
   
   
   
   
}
