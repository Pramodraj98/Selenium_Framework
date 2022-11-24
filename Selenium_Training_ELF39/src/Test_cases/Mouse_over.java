package Test_cases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Framework_utility.Base_test;
import Framework_utility.Utitlity_methods;

public class Mouse_over extends Base_test {
	
@Test()
	
	public void demo() {
		
	
	
	WebElement mouse_hover=driver.findElement(By.xpath("(//a[@href=\"/computers\"])[1]"));
	
	Utitlity_methods.actionclass(mouse_hover, driver);
//	action.moveToElement(mouse_hover).build().perform();
	
	WebElement button=driver.findElement(By.xpath("(//a[@href=\"/accessories\"])[1]"));
	Utitlity_methods.Click_Element(button);
		
	}
}
