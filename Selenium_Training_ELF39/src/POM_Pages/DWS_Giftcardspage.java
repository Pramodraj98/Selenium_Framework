package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWS_Giftcardspage {
	public DWS_Giftcardspage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//input[@type='button'])[3]")
	WebElement cart;
	
	public void Addcard_wishlist() {
		cart.click();
	}
}
