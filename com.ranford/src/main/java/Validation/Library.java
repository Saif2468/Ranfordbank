package Validation;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import TestBase.Base;

public class Library extends Base {

	
	public static boolean IsTittlePresent(String exp)
	{
		boolean b=driver.getTitle().contains(exp);
		return b;	
	}
	public static boolean IsAlertPresent(String exp)
	{
		boolean b1=driver.switchTo().alert().getText().contains(exp);
		return b1;
	}
	
	public static void takescreeshot(String screenshotname)
	{
		try{
			Robot r=new Robot();
			BufferedImage br=r.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
			ImageIO.write(br, "png", new File("./screen/"+screenshotname+".png"));
		
	}catch(Exception e){
		//1000 Auto-generated catch block
		e.printStackTrace();
	}
	}
}
	


