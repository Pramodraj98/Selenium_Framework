package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dms_register {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		//by using locator linktext just for click
		driver.findElement(By.linkText("Register")).click();
	
		//by using locator id when lintext is not present
		driver.findElement(By.id("FirstName")).sendKeys("Pramod");
		
		//by using locator name
		driver.findElement(By.name("Email")).sendKeys("pramod123@gmail.com");
		
		
		
	}
}
