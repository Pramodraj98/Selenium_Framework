package From_Selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demoguru_doubleclick {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		WebElement doubleclick=driver.findElement(By.cssSelector("button[ondblclick='myFunction()']"));
		Actions click=new Actions(driver);
		click.doubleClick(doubleclick).build().perform();
		
		
		
		
	}
}
