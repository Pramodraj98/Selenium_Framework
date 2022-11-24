package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_utility.Utitlity_methods;

public class DMS_AdvSearchpage extends Utitlity_methods{
public DMS_AdvSearchpage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

@FindBy(id="As")
WebElement advclk;

public void advance_click() {
	//Utitlity_methods.Click_Element(advclk); --- if utility extends used
	advclk.click();
}


}

