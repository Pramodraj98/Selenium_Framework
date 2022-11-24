package From_Selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("autocomplete")).sendKeys("Hong");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@id='ui-id-2']")).click();
		
		//driver.findElement(By.linkText("Hong Kong")).click(); -- this will not work coz it has multi values
		
	}
}
