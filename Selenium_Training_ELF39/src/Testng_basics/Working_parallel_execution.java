package Testng_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Working_parallel_execution {
@Test

	//@Test(invocationCount = 2,threadPoolSize = 2)
	public void parallel() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("small-searchterms")).sendKeys("Books");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.close();
	}
}
