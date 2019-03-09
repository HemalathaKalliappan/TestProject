package DataDriven;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {

	WebDriver driver;
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	       driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().deleteAllCookies();
	       driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	       driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en-GB&flowName=GlifWebSignIn&flowEntry=SignUp");
	}
	
	@DataProvider
	public Iterator<Object[]> gettestdata()
	{
		ArrayList<Object[]> test = TestUtil.getdatafromexcel();
		return test.iterator();
	}
	
		
	@Test(dataProvider ="gettestdata")
	public void dataprovider(String firstname, String Lastname, String Username, String Password) {
	driver.findElement(By.xpath("//*[@id=\"firstName\"]")).clear();
    driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys(firstname);
    
    driver.findElement(By.xpath("//*[@id=\"lastName\"]")).clear();
    driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys(Lastname);

    driver.findElement(By.xpath("//*[@id=\"username\"]")).clear();
    driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(Username);
    
    driver.findElement(By.xpath("//*[@id=\"passwd\"]/div[1]/div/div[1]/input")).clear();
    driver.findElement(By.xpath("//*[@id=\"passwd\"]/div[1]/div/div[1]/input")).sendKeys(Password);
	
}
}
