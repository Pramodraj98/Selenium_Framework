package From_Multiwindow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiwindow_fb {
	
	/*public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		// Make notE of parent window
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		
		// idenfy fb link
		driver.findElement(By.xpath("//a[contains(text(),'Facebook')]")).click();
		Thread.sleep(3000);
		Set<String>total=driver.getWindowHandles(); // to take the count of total window
		System.out.println(total);
		
		for(String child:total) { 
			//System.out.println(child); ------ print alphanum value
			
			//switch to child window
			driver.switchTo().window(child);
			System.out.println(driver.getTitle()); // --- to print title of pages 
			
			if(driver.getTitle().equalsIgnoreCase("NopCommerce - Home | Facebook")) {
				driver.findElement(By.name("email")).sendKeys("xxx123@gmail.com");
				
				Thread.sleep(3000);
				// close child window
				driver.close();
				
			}
							
		}
		// switch back to parent window
		driver.switchTo().window(parent);
		driver.close();
				
					}*/
	
	//fb open-close,enter mobiles [2]
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		// Make notE of parent window
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		
		// idenfy fb link
		driver.findElement(By.xpath("//a[contains(text(),'Facebook')]")).click();
		Thread.sleep(3000);
		Set<String>total=driver.getWindowHandles(); // to take the count of total window
		System.out.println(total);
		
		for(String child:total) { 
			//System.out.println(child); ------ print alphanum value
			
			//switch to child window
			driver.switchTo().window(child);
			System.out.println(driver.getTitle()); // --- to print title of pages 
			
			if(driver.getTitle().equalsIgnoreCase("NopCommerce - Home | Facebook")) {
				
				
				Thread.sleep(3000);
				// close child window
				driver.close();
				
			}
							
		}
		// switch back to parent window
		driver.switchTo().window(parent);
		
		driver.findElement(By.id("small-searchterms")).sendKeys("Mobile");
		Thread.sleep(3000);
		driver.close();
	
	}
	}