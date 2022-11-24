package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_xpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Dell/OneDrive/Desktop/TEST%20YANTRA/Selenium/Xpath%20files/xpath1.html");
		
		//for first name
		driver.findElement(By.xpath("(//input)[1]")).sendKeys("Pramod");
		
		// for last name
		driver.findElement(By.xpath("(//input)[2]")).sendKeys("Raj");
		
		//for company name
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("TYSS");
				
		// for location
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("BSK");
				
		
		
}
}
