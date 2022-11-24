package Testng_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_login {
	@DataProvider(name="Testdata")
	public Object[][] testdata(){
		Object[][] data=new Object[3][2];
		
		data [0][0]="pramod003@gmail.com";
		data [0][1]="Raj#123";
				
		
		data [1][0]="nimmi003@gmail.com";
		data [1][1]="nimmi#123";
				
		data [2][0]="raghu003@gmail.com";
		data [2][1]="raghu#123";
				
		return data;
				
		}
	@Test(dataProvider = "Testdata")
	public void registerdetails(String Email,String Password) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys(Email);
		driver.findElement(By.id("Password")).sendKeys(Password);
		driver.findElement(By.cssSelector("input[class='button-1 login-button']")).click();
		driver.close();
	}
}
