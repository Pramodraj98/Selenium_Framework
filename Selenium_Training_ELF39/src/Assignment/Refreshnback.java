package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Refreshnback {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.co.in");
	
	//navigate method
	driver.navigate().to("https://www.meesho.co.in");
	
	driver.manage().window().maximize();
	
	driver.navigate().back();
	
	driver.navigate().forward();
	
	driver.navigate().refresh();
	
	
	
}
}
