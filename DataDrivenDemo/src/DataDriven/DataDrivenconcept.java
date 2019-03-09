package DataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Xls_Reader.Xls_Reader;

public class DataDrivenconcept {
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver(); 
	     driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en-GB&flowName=GlifWebSignIn&flowEntry=SignUp");
		Xls_Reader data = new Xls_Reader("C:\\Users\\Hema\\eclipse-workspace\\DataDrivenDemo\\src\\TestData\\TestData.xlsx");
		  int rowcount = data.getRowCount("SignUp");
		  System.out.println(rowcount);
		
        data.addColumn("SignUP", "Result");
        System.out.println("Added");
                
        for(int rownum = 2; rownum<=rowcount;rownum++ ) {
        	
		String firstname = data.getCellData("SignUp", "FirstName", rownum);
	       System.out.println(firstname);
	      
	       
	       String Lastname = data.getCellData("SignUp", "LastName", rownum);
	       System.out.println(Lastname);
	       
	       String Username = data.getCellData("SignUp", "UserName", rownum);
	       System.out.println(Username);
	       
	       String Password = data.getCellData("SignUp", "Password", rownum);
	       System.out.println(Password);
	       driver.findElement(By.xpath("//*[@id=\"firstName\"]")).clear();
	       driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys(firstname);
	       
	       driver.findElement(By.xpath("//*[@id=\"lastName\"]")).clear();
	       driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys(Lastname);
	  
	       driver.findElement(By.xpath("//*[@id=\"username\"]")).clear();
	       driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(Username);
	       
	       driver.findElement(By.xpath("//*[@id=\"passwd\"]/div[1]/div/div[1]/input")).clear();
	       driver.findElement(By.xpath("//*[@id=\"passwd\"]/div[1]/div/div[1]/input")).sendKeys(Password);
		
		
       
       data.setCellData("SignUp", "Result", rownum, "Pass");
        }

}
}