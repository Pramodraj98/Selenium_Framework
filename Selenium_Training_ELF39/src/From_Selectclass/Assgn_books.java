package From_Selectclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//Reg-logout-login-click Books-select any 1 sortby-print all books on web

public class Assgn_books {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	
	/*//register
	driver.findElement(By.linkText("Register")).click();
	driver.findElement(By.id("gender-male")).click();
	driver.findElement(By.id("FirstName")).sendKeys("Pramod");
	driver.findElement(By.id("LastName")).sendKeys("Raj");
	driver.findElement(By.name("Email")).sendKeys("pramod016@gmail.com");
	driver.findElement(By.cssSelector("input[class='text-box single-line password']")).sendKeys("Raj#123");
	driver.findElement(By.id("ConfirmPassword")).sendKeys("Raj#123");
	driver.findElement(By.id("register-button")).click();
	
	//logout
	driver.findElement(By.linkText("Log out")).click();
	
	//login
	driver.findElement(By.className("ico-login")).click();
	driver.findElement(By.id("Email")).sendKeys("pramod016@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("Raj#123");
	driver.findElement(By.cssSelector("input[class='button-1 login-button']")).click();*/

	//books
	driver.findElement(By.xpath("//a[@href='/books']")).click();
	
	//sortby dropdown
	WebElement sortby=driver.findElement(By.id("products-orderby"));
	Select A=new Select(sortby);
	A.selectByVisibleText("Price: Low to High");
	
	
	List<WebElement>books=driver.findElements(By.xpath("//div[@class='product-item']"));
	//or  //div[@class='product-item'] -- TO PRINT ALL DETAILS
	//or  //div[@class='details'] -- TO PRINT ALL DETAILS
	// 
	
	//List<WebElement>books=driver.findElements(By.xpath("//img")); //-- TO PRINT ONLY NAMES
	//	//h2[@class='product-title'] -- get text
	
	for(int i=0;i<books.size();i++) {
		//System.out.println(books.get(i).getAttribute("alt")); // by using get attri
		System.out.println(books.get(i).getText()); // by using get text
		
	}
	
	
	}
}
