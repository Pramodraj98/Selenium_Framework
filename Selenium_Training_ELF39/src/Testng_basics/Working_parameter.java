package Testng_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Working_parameter {
	@Test
	@Parameters({"URL","Searchfield"})
	public void parameter(String abc,String def) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get(abc);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("small-searchterms")).sendKeys(def);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.close();
	}
}
