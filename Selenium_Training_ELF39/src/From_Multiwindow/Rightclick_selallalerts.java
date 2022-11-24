package From_Multiwindow;

import java.util.List;

import org.openqa.selenium.By;

// rightclick - SELECT each  OPTIONS-handle alerts

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick_selallalerts {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		WebElement ryt_click=driver.findElement(By.xpath("//span[contains(text(),'right click me')]")); //--- DEPENDENT XPATH
		Actions action=new Actions(driver);
		Thread.sleep(3000);
		
		List<WebElement>options=driver.findElements(By.xpath("//span[contains(text(),'Edit')]/../../li/span"));
		for(int i=0;i<options.size();i++) {
			action.contextClick(ryt_click).build().perform();
			Thread.sleep(3000);
			options.get(i).click();
			
			driver.switchTo().alert().accept();
		}
}
}
