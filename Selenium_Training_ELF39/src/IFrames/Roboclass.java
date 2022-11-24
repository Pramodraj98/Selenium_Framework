package IFrames;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Roboclass {
	public static void main(String[] args) throws AWTException, InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Dell/OneDrive/Desktop/TEST%20YANTRA/Selenium/Xpath%20files/demo.html");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		WebElement choose=driver.findElement(By.id("resume"));
		
		Actions action=new Actions(driver);
		action.moveToElement(choose).click().perform();
		
		Thread.sleep(2000); //no Find element
		
		//Create object of robot class
		
		Robot rbt=new Robot();
		rbt.keyPress(KeyEvent.VK_T);
		rbt.keyPress(KeyEvent.VK_E);
		rbt.keyPress(KeyEvent.VK_S);
		rbt.keyPress(KeyEvent.VK_T);
		
		
		for(int i=0;i<=2;i++) {
			Thread.sleep(4000);
			rbt.keyPress(KeyEvent.VK_TAB);
		}
		
		rbt.keyPress(KeyEvent.VK_ENTER);
		//rbt.keyPress(KeyEvent.VK_CANCEL);
		
	}
}
