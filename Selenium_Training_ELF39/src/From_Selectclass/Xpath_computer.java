package From_Selectclass;

         // comp-desktop-1st prod-cart

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_computer {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Computers")).click();
		driver.findElement(By.linkText("Desktops")).click();
		driver.findElement(By.xpath("(//div[@class='product-item'])[1]/div[2]/div[3]/div[2]/input")).click(); 
		
		driver.findElement(By.className("button-1 add-to-cart-button")).click();
		
		//driver.findElement(By.xpath("(((//table[@id='product'])[1]/tbody/tr)[4]/td)[3]/../../tr[7]/td[3]/../../tr[10]/td[3]"));
		
	}
}
