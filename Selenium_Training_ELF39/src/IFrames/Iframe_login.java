package IFrames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_login {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Dell/OneDrive/Desktop/TEST%20YANTRA/Selenium/Xpath%20files/iframe.html");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		// Identify the frame n switch to it
		
		/*
		// switch frame by index
		//  driver.switchTo().frame(0);
		
		// switch frame by name attribute
		//driver.switchTo().frame("frame1");
				
		//driver.findElement(By.xpath("//a[contains(text(),'Log')]")).click(); */
		
		/*
		//-- boooks in search using id attri
		// switching by id attribute
		
		driver.switchTo().frame("FR1");
		
		driver.findElement(By.id("small-searchterms")).sendKeys("Books");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		*/
		
		/*		//--- using webelement object
		
		WebElement frame=driver.findElement(By.id("FR1"));
		driver.switchTo().frame(frame);
		
		driver.findElement(By.id("small-searchterms")).sendKeys("Books");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		*/
		
		          // ---- Login click n SWITCH TO DEFAULT CONTENT AND CLICK ON GOOGLE
		
		WebElement frame=driver.findElement(By.id("FR1"));
		driver.switchTo().frame(frame);
		
		driver.findElement(By.xpath("//a[contains(text(),'Log')]")).click();
		
		// switch back to default content
				driver.switchTo().defaultContent();
				
				driver.findElement(By.xpath("//a[text()='Google']")).click();
		
	}
}
