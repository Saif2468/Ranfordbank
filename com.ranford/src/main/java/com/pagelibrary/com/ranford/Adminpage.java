package com.pagelibrary.com.ranford;

import org.openqa.selenium.WebElement;

import TestBase.Base;

public class Adminpage extends Base {
	
	
	public static WebElement Branches_button()
	{
		return driver.findElement(getElement("Branches"));
		}
	public static WebElement Roles_button()
	{
		return driver.findElement(getElement("Roles"));
		}
	public static WebElement Users_button()
	{
		return driver.findElement(getElement("Users"));
		}
	public static WebElement employee_button()
	{
		return driver.findElement(getElement("Employee"));
		}
}
