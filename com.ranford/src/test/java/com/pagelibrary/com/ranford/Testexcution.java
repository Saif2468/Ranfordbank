package com.pagelibrary.com.ranford;

import org.testng.annotations.Test;

public class Testexcution extends Reprository{

@Test(priority=0)
public void verify_launch()
{
	launch();
	}
@Test(priority=1)
public void verify_login()
{
	login();
}
@Test (priority=2)
public void verify_admin_page()
{
	branches();
}
@Test (priority=3)
public void verify_newbranch()
{
	newbranch();
	}
@Test (priority=4)
public void verify_newbranch_creation()
{
	Newbranch_creation();
	}
@Test (priority=5)
public void verify_Submit()
{
	Submit();
	}
}
