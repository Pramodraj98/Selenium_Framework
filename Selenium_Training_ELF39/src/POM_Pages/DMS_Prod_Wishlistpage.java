package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DMS_Prod_Wishlistpage {
	public DMS_Prod_Wishlistpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
		
	@FindBy(xpath="(//div[@class='product-item'])[1]")
	WebElement prod;
	
	@FindBy(id="add-to-wishlist-button-14")
	WebElement wish;
	
	@FindBy(linkText="Wishlist")
	WebElement list;
	
	public void Click_product() {
		prod.click();
	}
	
	public void Click_Wishlist() {
		wish.click();
	}
		
	public void View_wishlist() {
		list.click();
	}
}
