package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWS_Homepage {

	//constructor-- to initialize the driver instance & webelement
	public DWS_Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Webelements
	//-- login
	@FindBy(xpath="//a[text()='Log in']")
	WebElement login_link;
	
		//Method
	public void Click_login() {
		login_link.click();
	}
	
	//----WE--add to cart
	@FindBy(xpath="(//a[@href='/jewelry'])[1]")
	WebElement click_jewelry;
	
	public void click_jewelry() {
		click_jewelry.click();
	}
	
	//--- WE --search
	@FindBy(id="small-searchterms")
	WebElement srchfld;

	@FindBy(xpath="//input[@type='submit']")
	WebElement srch_fld;

	public void Search_field(String value) {
		srchfld.sendKeys(value);
	}

	public void Search_click() {
		srch_fld.click();
	}
	
	//--- register
	@FindBy(xpath="//a[@href='/register']")
	WebElement Reg_link;
	
	public void Register_click() {
		Reg_link.click();	
	}
	
	//---  actions
	@FindBy(xpath="(//a[@href='/computers'])[1]")
	WebElement mouse;
	
	public void Mouse_hover(WebDriver driver) {
		Actions action=new Actions(driver);
		action.moveToElement(mouse).perform();
		}
	
	//-- giftcards
	@FindBy(xpath="(//a[@href='/gift-cards'])[1]")
	WebElement gift;
	
	public void Click_giftcards() {
		gift.click();
	}
}
