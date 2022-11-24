package From_Multiwindow;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Webdriver_wait {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	
		
	driver.findElement(By.className("ico-register")).click();
	
	// create object of webdriverwait
	
	//implicit wait
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	
	// explicitly wait
		//WebDriverWait wait=new WebDriverWait(driver,25);
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='gender-male']"))));
	
	driver.findElement(By.xpath("//input[@id='gender-male']")).click();
	
	driver.findElement(By.id("FirstName")).sendKeys("Pramod");
	
	driver.findElement(By.id("LastName")).sendKeys("Raj");

	driver.findElement(By.name("Email")).sendKeys("pramod01630@gmail.com");
	
	driver.findElement(By.cssSelector("input[class='text-box single-line password']")).sendKeys("Raj#123");
	
	driver.findElement(By.id("ConfirmPassword")).sendKeys("Raj#123");
	
	driver.findElement(By.id("register-button")).click();
	
	
	//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='result']"))));
	
	String value=driver.findElement(By.xpath("//div[@class='result']")).getText();
	System.out.println(value);
	
	if(value.equalsIgnoreCase("Your registration completed")) {
		System.out.println("Done");
	}
	
	
}
}
