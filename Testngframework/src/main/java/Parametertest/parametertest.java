package Parametertest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class parametertest {

	WebDriver driver;
		
	@Test
	@Parameters({"browser","emailid","password"})
	public void parameter(String browser,String emailid, String password) {
		
		 if (browser.equalsIgnoreCase("firefox"))
	        {
	        driver = new FirefoxDriver();
	        } else if (browser.equalsIgnoreCase("chrome"))
	        {
	       System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
	       driver = new ChromeDriver();
	        }
	        else if (browser.equalsIgnoreCase("ie"))
	        {
	        System.setProperty("webdriver.ie.driver", "");
	        driver = new InternetExplorerDriver();
	        }
	System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
    WebDriver driver = new ChromeDriver(); 
    //driver.findElement(By.id(""));
    driver.manage().window().maximize();
	
	driver.get("https://symbizsolutions.com/sugar/index.php?action=Login&module=Users");
	
	driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys(emailid);
	driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys(password);
	driver.findElement(By.xpath("//input[@title='Log In']")).click();
	}
}
