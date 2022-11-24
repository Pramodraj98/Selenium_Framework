package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dms_csssel {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.cssSelector("input[autocomplete='off']")).sendKeys("computer");
	
	driver.findElement(By.cssSelector("input[class='button-1 search-box-button']")).click();
	  
}
}
