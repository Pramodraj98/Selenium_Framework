package From_Multiwindow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bwoserstack_alert {
	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.navigate().to("https://www.browserstack.com/users/sign_up");
			driver.manage().window().maximize();
			
			driver.findElement(By.id("bs-auth-input-fullname")).sendKeys("Rghu");
			driver.findElement(By.id("bs-auth-input-email")).sendKeys("raghu101@gmail.com");
			driver.findElement(By.id("bs-auth-input-password")).sendKeys("raghu@101");
			
			driver.findElement(By.id("tnc_checkbox")).click();
			
			driver.findElement(By.id("bs-auth-input-cta")).click();
			
			Thread.sleep(3000);
			
			driver.switchTo().alert().accept();
			
			
			
			
			
		}
}
