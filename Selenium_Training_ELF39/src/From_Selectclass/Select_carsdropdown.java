package From_Selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_carsdropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Dell/OneDrive/Desktop/TEST%20YANTRA/Selenium/Xpath%20files/demo.html");
		driver.manage().window().maximize();
		
		//Identifying  the web element of Select type
		WebElement cars=driver.findElement(By.id("standard_cars"));
		
		//Create obejct for select class
		Select A=new Select(cars);
		
		//by using 3 diff methods we can select 
		//[1] by using visible text
		A.selectByVisibleText("Audi");
		Thread.sleep(3000);
		
		//by using value
		A.selectByValue("bmw");
		Thread.sleep(3000);
		
		//by index
		A.selectByIndex(3);
	}
}
