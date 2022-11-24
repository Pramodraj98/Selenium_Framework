package SelPractice_RSacadmy;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchtab {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
		String parent=driver.getWindowHandle();
		
		driver.findElement(By.id("opentab")).click();
		
		Set<String> total=driver.getWindowHandles();
		
		for(String child:total) {
			driver.switchTo().window(child);
			Thread.sleep(2000);
			System.out.println(driver.getTitle());
			
			driver.close();
		}
		Thread.sleep(2000);
		driver.switchTo().window(parent);
		driver.close();
	}
}
