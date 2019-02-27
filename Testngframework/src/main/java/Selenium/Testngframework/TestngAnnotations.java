package Selenium.Testngframework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngAnnotations {


@BeforeSuite
public void Setup(){
System.out.println("setup---->beforesuite");	
}
@BeforeTest
public void LaunchBrowser() {
	
	System.out.println("Lauchbrowser---->beforetest");	
	}

@BeforeClass
public void login() {
	System.out.println("login---->beforeclass");
	
}

@BeforeMethod
public void EnterURL() {
	
	System.out.println("Enter--->beforemethod");
	
}


@Test
public void gettitle()
{
	System.out.println("gettile--->test");
}

@Test
public void newcompany() {
	System.out.println("newcompany--->test");
	}


@AfterMethod
public void logout()
{
	
	System.out.println("logout--->aftermethod");
}

@AfterClass
public void closebrowser()
{
	System.out.println("gettile---Afterclass");
	
}
@AfterTest
public void deletecookies() {
	System.out.println("gettile--->aftertest");
	
}
}
