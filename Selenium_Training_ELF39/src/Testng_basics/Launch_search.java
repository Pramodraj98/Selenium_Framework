package Testng_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Launch_search {
@Test

public void Dws() {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.className("ico-login")).click();
}
}
