package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dms_xpathregister {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("/html/body[1]/div[4]/div/div/div[2]/div/ul/li/a[@class='ico-register']")).click();
	}
}
