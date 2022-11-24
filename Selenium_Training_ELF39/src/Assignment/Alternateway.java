package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alternateway {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	
	//alternate for id
	driver.findElement(By.cssSelector("#small-searchterms")).click();
	
	//alternate for class name
	driver.findElement(By.cssSelector(".search-box-text.ui-autocomplete-input")).click();
}
}
