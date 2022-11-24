package From_Selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		WebElement computers=driver.findElement(By.xpath("//a[contains(text(),'Comp')]"));
		Actions desk=new Actions(driver);
		desk.moveToElement(computers).build().perform();
		
		Thread.sleep(3000);
		desk.moveToElement(driver.findElement(By.xpath("(//a[@href='/desktops'])[1]"))).click().perform();
		
	}
}
