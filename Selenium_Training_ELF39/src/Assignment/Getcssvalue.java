package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getcssvalue {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		String getcss=driver.findElement(By.className("ico-register")).getCssValue("background-clip");
		System.out.println(getcss);
		
		String getcss1=driver.findElement(By.className("ico-register")).getCssValue("color");
		System.out.println(getcss1);
		
	}
}
