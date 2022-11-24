package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dms_searchbarbyclsname {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		//by using classname
		driver.findElement(By.className("search-box-text ui-autocomplete-input")).click();
		
		driver.findElement(By.className("search-box-text ui-autocomplete-input")).sendKeys("cover");
		
		driver.findElement(By.className("button-1 search-box-button")).click();

		//driver.close();
	}
}
