package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_textmethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		
		String sop=driver.findElement(By.linkText("Register")).getText();
		
		System.out.println(sop);
		Thread.sleep(2000);
		
		String sop1=driver.findElement(By.cssSelector("h2[class='topic-html-content-header']")).getText();	
		//String sop1=driver.findElement(By.id("newsletter-subscribe-button")).getText();
		
		System.out.println(sop1);
		
				
	}
}
