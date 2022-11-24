package From_Selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Copypaste {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		WebElement search=driver.findElement(By.id("small-searchterms"));
				Actions tab=new Actions(driver);
				tab.moveToElement(search).click().perform();
				Thread.sleep(3000);
				
				// to enter in caps
				//tab.keyDown(Keys.LEFT_SHIFT).sendKeys("computer").keyUp(Keys.LEFT_SHIFT).perform();
		
				// copy paste
				tab.keyDown(Keys.LEFT_CONTROL).sendKeys("v").keyUp(Keys.LEFT_CONTROL).perform();
			}
}
