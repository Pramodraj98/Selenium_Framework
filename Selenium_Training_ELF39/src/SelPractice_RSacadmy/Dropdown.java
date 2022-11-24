package SelPractice_RSacadmy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		WebElement drop=driver.findElement(By.id("dropdown-class-example"));
		
		Select down=new Select(drop);
		
		//down.selectByIndex(1); 
//		down.selectByValue("option2");
//		down.selectByVisibleText("Option3");
		
		List<WebElement> select=down.getOptions();
		
		for(int i=0;i<select.size();i++) {
			System.out.println(select.get(i).getText());
		}
		
	}
}
