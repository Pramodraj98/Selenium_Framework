package From_Multiwindow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoguru_alert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("cusid")).sendKeys("raaghu069");
		driver.findElement(By.name("submit")).click();
		
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		
		
}
}

