package SelPractice_RSacadmy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		List<WebElement> check=driver.findElements(By.xpath("//input[contains(@name,'check')]"));
		
		for(int i=0;i<check.size();i++) {
			check.get(i).click();
		}
		Thread.sleep(2000);
	}
}
