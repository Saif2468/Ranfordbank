package com.pagelibrary.com.ranford;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import TestBase.Base;

public class Loginpage extends Base {
	
public static WebElement username_edit()
{
	return driver.findElement(getElement("username"));
	}
public static WebElement pass_edit()
{
	return driver.findElement(getElement("password"));
	}
public static WebElement login_button()
{
	return driver.findElement(getElement("login"));
	}
}