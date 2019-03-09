package Parametertest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ReadProperties {
	
	public static void main(String args[]) throws IOException {
		WebDriver driver = null;
	Properties properties = new Properties();
	FileInputStream ip = new FileInputStream("C:\\Users\\Hema\\git\\TestProject\\Testngframework\\src\\main\\java\\configfile\\config.properties");
	properties.load(ip);
 System.out.println(properties.getProperty("browser"));
 String browser = properties.getProperty("browser");
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

/*	System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
WebDriver driver = new ChromeDriver(); */
//driver.findElement(By.id(""));
driver.manage().window().maximize();

driver.get(properties.getProperty("url"));

driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys(properties.getProperty("username"));
driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys(properties.getProperty("password"));
driver.findElement(By.xpath("//input[@title='Log In']")).click();
	}

	
	}

