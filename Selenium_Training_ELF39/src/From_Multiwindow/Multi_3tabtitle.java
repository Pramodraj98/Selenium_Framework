package From_Multiwindow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multi_3tabtitle {
	
	/*
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Dell/OneDrive/Desktop/TEST%20YANTRA/Selenium/Xpath%20files/MultipleWindow.html");
		driver.manage().window().maximize();
		
		// Make notE of parent window
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		
		// click on food menu
		driver.findElement(By.cssSelector("input[type='button']")).click();
		Thread.sleep(3000);
		Set<String>total=driver.getWindowHandles(); // to take the count of total window
		System.out.println(total);
		
		for(String child:total) { 
			
			driver.switchTo().window(child);
			System.out.println(driver.getTitle()); // --- to print title of pages 
		
		driver.close();
	}
		
//driver.switchTo().window(parent);
//		
//		
//		Thread.sleep(3000);
//		driver.close();
}
	*/
	
	// olive dont print
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Dell/OneDrive/Desktop/TEST%20YANTRA/Selenium/Xpath%20files/MultipleWindow.html");
		driver.manage().window().maximize();
		
		// Make notE of parent window
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		
		// click on food menu
		driver.findElement(By.cssSelector("input[type='button']")).click();
		Thread.sleep(3000);
		Set<String>total=driver.getWindowHandles(); // to take the count of total window
		System.out.println(total);
		
		for(String child:total) { 
			
			driver.switchTo().window(child);
			if(driver.getTitle().equalsIgnoreCase("Olive Garden Italian Restaurant | Family Style Dining | Italian Food")) {
			driver.close();
			}
			
		
			}
	
}
}
