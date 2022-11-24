package SelPractice_RSacadmy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchto_alert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		// simple alert 
		/*driver.findElement(By.id("name")).sendKeys("Raj");
		Thread.sleep(3000);
		driver.findElement(By.id("alertbtn")).click();
		Alert all=driver.switchTo().alert();
		System.out.println(all.getText());
		Thread.sleep(3000);
		all.accept();*/
		
		driver.findElement(By.id("name")).sendKeys("Raj");
		Thread.sleep(3000);
		driver.findElement(By.id("confirmbtn")).click();
		Alert all=driver.switchTo().alert();
		System.out.println(all.getText());
		Thread.sleep(3000);
		all.dismiss();
		
	}
}
