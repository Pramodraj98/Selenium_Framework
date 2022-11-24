package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DWS_Jewelrypage {
	//constructor
public DWS_Jewelrypage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
//We
@FindBy(id="products-orderby")
WebElement dropdown_1;


@FindBy(xpath="(//input[@type='button'])[2]")
WebElement Click_addtocart;

//method
public void Click_sortby() {
	dropdown_1.click();
	}

public void select_sortby(String choose) {
	Select select=new Select(dropdown_1);
	select.selectByVisibleText(choose);
	
	
}
public void Click_addtocart() {
	Click_addtocart.click();
}

}



