package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelements_intextfields {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Dell/OneDrive/Desktop/TEST%20YANTRA/Selenium/Xpath%20files/demo.html");
		driver.manage().window().maximize();
		
		List<WebElement> text=driver.findElements(By.xpath("//input[@type='text']"));
		
		
		String a[]= {"a","b","c","d","e","f","g","h","I","J","K"};// to print diff values
		for(int i=0;i<text.size();i++) {
			
			text.get(i).sendKeys(a[i]);// to print diff values
			//text.get(i).sendKeys(i+"");
		}
	
	}
}
