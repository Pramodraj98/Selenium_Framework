package From_Selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

// jobsearch -jobskills-java jobs

public class Monster_javajobs {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.monsterindia.com/");
		driver.manage().window().maximize();
		
		WebElement jobsearch=driver.findElement(By.xpath("(//a[@class='main-nav-link'])[2]"));
		Actions desk=new Actions(driver);
		desk.moveToElement(jobsearch).build().perform();
		
		Thread.sleep(3000);
		desk.moveToElement(driver.findElement(By.xpath("//a[text()='Jobs by Skills']"))).click().perform();
		
		Thread.sleep(3000);
		desk.moveToElement(driver.findElement(By.xpath("(//a[contains(@onclick,'window')])[24]"))).click().perform();
		
	}
}
