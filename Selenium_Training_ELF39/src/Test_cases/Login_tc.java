package Test_cases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_utility.Base_test;
import Framework_utility.Utitlity_methods;

public class Login_tc extends Base_test{
	
@DataProvider(name="login")
	
	public Object[]testlog() throws IOException{
		Object[][]data=Utitlity_methods.getTestData("Login");         //new Object[1][2];
//		data [0][0]="pramod003@gmail.com";
//		data [0][1]="Raj#123";
		
		return data;
	}
	@Test(dataProvider="login")
	public void login(String mailid,String pwd) {
		WebElement login_click=driver.findElement(By.className("ico-login"));
		// Click_Element(login_link)
		Utitlity_methods.Click_Element(login_click);
		
		//driver.findElement(By.id("Email")).sendKeys("pramod001@gmail.com");
		WebElement username=driver.findElement(By.id("Email"));
		//Enter_Value_In_Textfield(username, "pramod001@gmail.com");
		Utitlity_methods.Enter_Value_In_Textfield(username, mailid);
		
		//driver.findElement(By.id("Password")).sendKeys("Raj#123");
		WebElement passwrd=driver.findElement(By.id("Password"));
		//Enter_Value_In_Textfield(passwrd, "Raj#123");
		Utitlity_methods.Enter_Value_In_Textfield(passwrd, pwd);
		
		WebElement submit=driver.findElement(By.cssSelector("input[class='button-1 login-button']"));
		Utitlity_methods.Click_Element(submit);
		
		WebElement logout=driver.findElement(By.xpath("//a[contains(text(),'Log')]"));
		Utitlity_methods.Click_Element(logout);
		}
	}
