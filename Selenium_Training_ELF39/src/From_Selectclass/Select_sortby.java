package From_Selectclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_sortby {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@href='/books']")).click();
		
		WebElement sortby=driver.findElement(By.id("products-orderby"));
		Select A=new Select(sortby);
		
		List<WebElement> B=A.getOptions();
		
		for(int i=0;i<B.size();i++) {
			System.out.println(B.get(i).getText());
		}
	}
}
