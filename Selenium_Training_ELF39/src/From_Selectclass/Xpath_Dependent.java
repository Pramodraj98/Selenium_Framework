
package From_Selectclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath_Dependent {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
	
		
	//driver.findElement(By.xpath("(//fieldset)[2]/input")).sendKeys("India");
	// from parent to child
	
	
	
	WebElement drop=driver.findElement(By.id("dropdown-class-example"));
	Select A=new Select(drop);
	
	List<WebElement>b=A.getOptions();
	
	for(int i=0;i<b.size();i++) {
		System.out.println(b.get(i).getText());
		
	}
	Thread.sleep(4000);
	}
}
