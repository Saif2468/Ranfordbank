package com.pagelibrary.com.ranford;

import org.openqa.selenium.WebElement;

import TestBase.Base;

public class Newbranch extends Base {

	

	public static WebElement Branchname_edit()
	{
		return driver.findElement(getElement("Branchname"));
		}
	public static WebElement Address1_edit()
	{
		return driver.findElement(getElement("Address1"));
		}
	public static WebElement Address2_edit()
	{
		return driver.findElement(getElement("Address2"));
		}
	public static WebElement Address3_edit()
	{
		return driver.findElement(getElement("Address3"));
		}
	public static WebElement Area_edit()
	{
		return driver.findElement(getElement("Area"));
		}
	public static WebElement Zipcode_edit()
	{
		return driver.findElement(getElement("Zipcode"));
		}
	public static WebElement Country_edit()
	{
		return driver.findElement(getElement("Country"));
		}
	public static WebElement State_edit()
	{
		return driver.findElement(getElement("State"));
		}
	public static WebElement City_edit()
	{
		return driver.findElement(getElement("City"));
		}
	public static WebElement Submit_button()
	{
		return driver.findElement(getElement("Submit"));
	}
			
	} 
