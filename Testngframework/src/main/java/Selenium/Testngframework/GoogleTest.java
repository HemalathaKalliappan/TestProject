package Selenium.Testngframework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Parametertest.ReadProperties;

public class GoogleTest extends ReadProperties {
	 WebDriver driver;
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	       driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().deleteAllCookies();
	       driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	       driver.get("https://www.google.com/");
	}
	
	
	@Test(priority=1, groups="Homepage")
	public void gettitle()
	{
		String title = driver.getTitle();
		System.out.println(title);
	}

	@Test(priority=3, groups="Homepage")
	public void googlelogotest() {
		driver.findElement(By.xpath("//*[@id=\"hplogo\"]")).isDisplayed();
		System.out.println("");
		}
	
	@Test(priority=2, groups="Loginpage")
	public void maillink() {
		driver.findElement(By.linkText("Gmail")).isDisplayed();
		System.out.println("");
		}

	@Test(priority=4, groups="test")
	public void test() {
		
		System.out.println("test");
		}
	@Test(priority=5, groups="test")
	public void test1() {
		
		System.out.println("test");
		}
}
