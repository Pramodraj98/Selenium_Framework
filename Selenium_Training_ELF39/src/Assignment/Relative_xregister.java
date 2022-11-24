package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_xregister {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		
		driver.findElement(By.xpath("//input[@class='text-box single-line']")).sendKeys("Pramod");
	}
}
