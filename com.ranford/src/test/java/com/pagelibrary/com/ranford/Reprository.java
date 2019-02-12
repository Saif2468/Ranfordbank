package com.pagelibrary.com.ranford;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import TestBase.Base;
import Validation.Library;

public class Reprository extends Base {

	
	public  void launch()
	{   
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(getconfig("build1"));
		String actualurl=driver.getCurrentUrl();
		String expurl=getconfig("build1");
		if(actualurl.contains(expurl))
		{
			Reporter.log("launch test is pass because my actualurl:"+actualurl+"is matching with my expurl:-"+expurl);
		}
		else
		{
			Reporter.log("launch test is fail because my actualurl:"+actualurl+"is not matching with my expurl:-"+expurl);
		Library.takescreeshot("launch");
		}
		
	}
	public void login()
	{
		
		Loginpage.username_edit().sendKeys(getconfig("username"));
		Loginpage.pass_edit().sendKeys(getconfig("password"));
		Loginpage.login_button().click();

		if(Library.IsTittlePresent(getconfig("loginexptittle"))) {
			 
			Reporter.log("login is pass because my actualtittle:"+driver.getTitle()+"is matching with loginexptittle");
		}
		else {
			Reporter.log("login is fail because my actualtittle:"+driver.getTitle()+"is not matching with loginexptittle");
			Library.takescreeshot("login");
			System.out.println( "title=" + driver.getTitle());
		}

	}
	public void  branches()
	{
		Adminpage.Branches_button().click();
	}
	public void roles()
	{
		Adminpage.Roles_button().click();
	}
	public void user()
	{
		Adminpage.Users_button().click();
	}
	public void employee()
	{
		Adminpage.employee_button().click();
	}
	public void newbranch()
	{
		Branchespage.Newbranch_button().click();
	}
	public void Newbranch_creation ()
	{
	Newbranch.Branchname_edit().sendKeys(getconfig("Branchname"));	
	Newbranch.Address1_edit().sendKeys(getconfig("Address1"));
	Newbranch.Address2_edit().sendKeys(getconfig("Address2"));
	Newbranch.Address3_edit().sendKeys(getconfig("Address3"));
	Newbranch.Area_edit().sendKeys(getconfig("Area"));  
	Newbranch.Zipcode_edit().sendKeys(getconfig("Zipcode"));
WebElement e=Newbranch.Country_edit();
			Select s=new Select(e);
			s.selectByVisibleText(getconfig("Country"));
			WebElement f=Newbranch.State_edit();
			Select s1=new Select(f);
			s1.selectByVisibleText(getconfig("State"));
			
			WebElement h=Newbranch.City_edit();
			Select s2=new Select(h);
			s2.selectByVisibleText(getconfig("City"));
					
	}	
    public void Submit()
  {
	Newbranch.Submit_button().click();

    
    if(Library.IsAlertPresent(getconfig("Submition_alert"))) {
		 
		Reporter.log("Submition is pass because my actualalert:"+driver.getWindowHandle()+"is matching with expalert");
	}
	else {
		Reporter.log("Submition is fail because my actualalert:"+driver.getWindowHandle()+"is not matching with expalert");
		Library.takescreeshot("Submit");
		System.out.println( "title=" + driver.getWindowHandle());
	}
}

}
