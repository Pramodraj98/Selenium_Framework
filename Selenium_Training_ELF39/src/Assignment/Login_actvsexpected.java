package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_actvsexpected {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.className("ico-login")).click();
		
		driver.findElement(By.id("Email")).sendKeys("pramod016@gmail.com");
		
		driver.findElement(By.id("Password")).sendKeys("Raj#123");
		
		driver.findElement(By.cssSelector("input[class='button-1 login-button']")).click();
		
		//validation
		
		String actual=driver.findElement(By.className("account")).getText();
		
		System.out.println(actual);
		
		String expected="pramod016@gmail.com";
		
		if(actual.equalsIgnoreCase(expected)) {
			System.out.println("Logged in");
		}
		else {
			System.out.println("In logged");
		}
		
	
}
}
