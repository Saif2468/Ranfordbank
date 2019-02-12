package TestBase;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
public static WebDriver driver;
static Properties property;
public static void loadproperty()
{
	
try {
	File f=new File ("./src/main/java/configuration/OR.properties");
	FileReader fr=new FileReader(f);
	property=new Properties();
	property.load(fr);
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
public static By getElement(String key)
{
	loadproperty();
By loc=null;
String value = property.getProperty(key);
String loctype= value.split(":")[0];
String locval= value.split(":")[1];
if(loctype.equals("id"))
{
	loc=By.id(locval);
}
else if(loctype.equals("xpath"))
{
	loc=By.xpath(locval);
	}
else if(loctype.equals("name"))
{
loc=By.name(locval);
}
else if(loctype.equals("linktext"))
{
	loc=By.linkText(locval);
}
	else if(loctype.equals("className"))
	{
		loc=By.className(locval);
	}
	else if(loctype.equals("tagName"))
	{
		loc=By.tagName(locval);
	}
	else if(loctype.equals("cssSelector"))
	{
		loc=By.cssSelector(locval);
}
	else if(loctype.equals("partialLinkText"))
	{
		loc=By.partialLinkText(locval);
		}
return loc;

	}
public static void loadpropertyconfig()
{
try {
	File f1=new File ("./src/main/java/configuration/config.properties");
	FileReader fr=new FileReader(f1);
	property=new Properties();
	property.load(fr);
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
public static String getconfig(String Key){
	
	loadpropertyconfig();
	String k= property.getProperty(Key);
	return k;
}
}
