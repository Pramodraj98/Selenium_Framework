package From_Multiwindow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		WebElement dclick=driver.findElement(By.xpath("//button[contains(text(),'Double')]"));
		Actions act=new Actions(driver);
		act.doubleClick(dclick).perform();
		Thread.sleep(3000);
		
		//switching the alert
		//Alert ale=
		driver.switchTo().alert().accept();
		
		// handling the alert
		//ale.accept();
		
		
}
}