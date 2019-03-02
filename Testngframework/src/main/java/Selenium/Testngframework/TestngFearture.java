package Selenium.Testngframework;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngFearture {

	
	@Test
	public void loginurl() {
		System.out.println("logintest");
		//int i =9/0;
	}
	
	@Test(dependsOnMethods="loginurl")
	public void homepage() {
		System.out.println("homepage");		
	}
	
	
}
