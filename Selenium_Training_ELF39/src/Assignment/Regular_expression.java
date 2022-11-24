package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Regular_expression {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		
		//by using class name
		//driver.findElement(By.xpath("//input[contains(@class,'box')]")).click();
		
		// by using text
		driver.findElement(By.xpath("//a[contains(text(),'Gift')]")).click();
		
		
	}
}
