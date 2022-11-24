package Testng_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_Register {
	@DataProvider(name="Testdata")
	public Object[][] testdata(){
		Object[][] data=new Object[3][5];
		data [0][0]="Pramod";
		data [0][1]="Raj";
		data [0][2]="pramod003@gmail.com";
		data [0][3]="Raj#123";
		data [0][4]="Raj#123";
		
		data [1][0]="Nimmi";
		data [1][1]="Dummi";
		data [1][2]="nimmi003@gmail.com";
		data [1][3]="nimmi#123";
		data [1][4]="nimmi#123";
		
		data [2][0]="Raghu";
		data [2][1]="Kash";
		data [2][2]="raghu003@gmail.com";
		data [2][3]="raghu#123";
		data [2][4]="raghu#123";
		
		return data;
 	}
	
	@Test(dataProvider = "Testdata")
	public void registerdetails(String Firstname,String Lastname,String Email,String Password,String Confirmpassword) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
	driver.findElement(By.id("FirstName")).sendKeys(Firstname);
	driver.findElement(By.id("LastName")).sendKeys(Lastname);
	driver.findElement(By.name("Email")).sendKeys(Email);
		driver.findElement(By.cssSelector("input[class='text-box single-line password']")).sendKeys(Password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(Confirmpassword);
		driver.findElement(By.id("register-button")).click();
		
		driver.close();
	}
}

