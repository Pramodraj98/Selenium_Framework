package From_Selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_sendkeysNpagedown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		WebElement search=driver.findElement(By.id("small-searchterms"));
				Actions tab=new Actions(driver);
				//tab.moveToElement(search).click().sendKeys("computer").perform();
				tab.sendKeys(search,"computer").perform();
				Thread.sleep(3000);
				
				tab.sendKeys(Keys.PAGE_DOWN).perform();
		
			}
}
