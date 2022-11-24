package SelPractice_RSacadmy;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchwindow {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		String parent=driver.getWindowHandle();
		
		driver.findElement(By.id("openwindow")).click();
		
		Set<String>total=driver.getWindowHandles();
		
		for(String child:total) {
			driver.switchTo().window(child);
			Thread.sleep(2000);
			System.out.println(driver.getTitle());
			
			if(driver.getTitle().equalsIgnoreCase("QA Click Academy | Selenium,Jmeter,SoapUI,Appium,Database testing,QA Training Academy")) {
				driver.findElement(By.xpath("//a[contains(text(),'Videos')]")).click();
			}
			
			//driver.close();
		}
		Thread.sleep(4000);
		driver.switchTo().window(parent);
//		driver.close();
		
	}
}
