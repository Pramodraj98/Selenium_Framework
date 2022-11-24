package SelPractice_RSacadmy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Suggestion {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("autocomplete")).sendKeys("Aust");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//div[contains(text(),'Australia')])[1]")).click();
	}
}
