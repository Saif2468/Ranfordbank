package com.pagelibrary.com.ranford;

import org.openqa.selenium.WebElement;

import TestBase.Base;

public class Branchespage extends Base{
	public static WebElement Newbranch_button()
	{
		return driver.findElement(getElement("Newbranch"));
		}
	public static WebElement country_dropdown()
	{
		return driver.findElement(getElement("Country1"));
		}
	public static WebElement State_dropdown()
	{
		return driver.findElement(getElement("State1"));
		}
	public static WebElement City_dropdown()
	{
		return driver.findElement(getElement("City1"));
		}
	public static WebElement Search_button()
	{
		return driver.findElement(getElement("Search"));
		}
	public static WebElement Clear_button()
	{
		return driver.findElement(getElement("Clear"));
	}
	
}
