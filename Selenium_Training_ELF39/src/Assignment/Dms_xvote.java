package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dms_xvote {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.className("ico-login")).click();
		
		driver.findElement(By.id("Email")).sendKeys("pramod016@gmail.com");
		
		driver.findElement(By.id("Password")).sendKeys("Raj#123");
		
		driver.findElement(By.cssSelector("input[class='button-1 login-button']")).click();
		
		
		driver.findElement(By.xpath("//input[@id='pollanswers-4']")).click();
		
		driver.findElement(By.xpath("//input[@id='vote-poll-1']")).click();
		
		
}
}
