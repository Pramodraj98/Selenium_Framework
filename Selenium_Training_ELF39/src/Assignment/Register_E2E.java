package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register_E2E {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.linkText("Register")).click();
	
		driver.findElement(By.id("gender-male")).click();
		
		driver.findElement(By.id("FirstName")).sendKeys("Pramod");
		
		driver.findElement(By.id("LastName")).sendKeys("Raj");
	
		driver.findElement(By.name("Email")).sendKeys("pramod123@gmail.com");
		
		driver.findElement(By.cssSelector("input[class='text-box single-line password']")).sendKeys("Raj@123");
		
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Raj@123");
		
		driver.findElement(By.id("register-button")).click();
		
		
		
	}
}
