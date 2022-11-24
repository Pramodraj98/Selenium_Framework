package SelPractice_RSacadmy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	driver.manage().window().maximize();
	
	List<WebElement> radio=driver.findElements(By.xpath("//input[@name='radioButton']"));
	
	for(int i=0;i<radio.size();i++) {
		radio.get(i).click();
	}
	Thread.sleep(2000);
}
}
