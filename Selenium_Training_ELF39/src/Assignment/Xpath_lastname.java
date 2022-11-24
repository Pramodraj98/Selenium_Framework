package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_lastname {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Dell/Downloads/xpath1.html");
		
		
		// for last name
		driver.findElement(By.xpath("/html/body/div[1]/input[2]")).sendKeys("Raj");
		
		//for company
		driver.findElement(By.xpath("/html/body/div[2]/input")).sendKeys("TYSS");
		
		//FOR LOCATION
		driver.findElement(By.xpath("/html/body/div[2]/input[2]")).sendKeys("BSK");
}
}
