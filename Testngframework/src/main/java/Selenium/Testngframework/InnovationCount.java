package Selenium.Testngframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InnovationCount {
	
	public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver(); 
		   //driver.findElement(By.id(""));
		   driver.manage().deleteAllCookies();
		   driver.manage().window().maximize();
			
		   driver.get("https://classic.crmpro.com/index.html");

		   driver.findElement(By.name("username")).sendKeys("naveenautomation");
		   driver.findElement(By.name("password")).sendKeys("test@123");
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//input[@type='submit']")).click();
		   driver.switchTo().frame("mainpanel");
		   String d1 =driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).getText();
		   System.out.println(d1);
		 //  driver.switchTo().frame("mainpanel");
		   driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		  
	}

	/*@Test(invocationCount=10)
	public void test() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}*/
}
