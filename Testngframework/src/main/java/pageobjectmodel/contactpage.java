package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


import Baseclass.TestBase;

public class contactpage extends TestBase {
	
	
	@FindBy(xpath = "//a[contains(text(),'Contacts')]")
	WebElement contactsLink;
	
	@FindBy(xpath = "//a[contains(text(),'New Contact')]")
	WebElement newContactLink;
	
	@FindBy(xpath= "//*[@name=\"title\"]")
	WebElement title;
	
	@FindBy(id="first_name")
	WebElement firstName;
	
	@FindBy(id="surname")
	WebElement lastName;
	
	@FindBy(name="client_lookup")
	WebElement company;
	
	@FindBy(xpath = "//input[@type='submit' and @value='Save']")
	WebElement saveBtn;
	
	// Initializing the Page Objects:
	public contactpage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void title(String name) {
		Select select = new Select(title);
		select.selectByVisibleText(prop.getProperty("name"));
		
	}

	public boolean verifyContactsLabel(){
		return contactsLink.isDisplayed();
	}
	
	public void clickOnContactsLink(){
		contactsLink.click();
	}
	public void clickOnNewContactLink(){
		Actions action = new Actions(driver);
		action.moveToElement(contactsLink).build().perform();
		newContactLink.click();
		
	}
		
	
	public void createNewContact(){
				
		firstName.sendKeys(prop.getProperty("ftName"));
		lastName.sendKeys(prop.getProperty("ltName"));
		company.sendKeys(prop.getProperty("comp"));
		saveBtn.click();
		
	}
	
}
