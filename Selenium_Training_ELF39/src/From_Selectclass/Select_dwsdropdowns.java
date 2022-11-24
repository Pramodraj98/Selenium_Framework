package From_Selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_dwsdropdowns {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	
	// click on books
	driver.findElement(By.xpath("//a[@href='/books']")).click();
	
	// for sort by
	WebElement drop=driver.findElement(By.id("products-orderby"));
	Select A=new Select(drop);
	
	A.selectByVisibleText("Position");
	Thread.sleep(3000);
	
	// for display
		WebElement drop1=driver.findElement(By.id("products-pagesize"));
		Select B=new Select(drop1);
	
	B.selectByVisibleText("4");
	Thread.sleep(3000);
	
	//for view as
	WebElement drop2=driver.findElement(By.id("products-viewmode"));
	Select C=new Select(drop2);

	//C.selectByVisibleText("List");
	C.selectByIndex(1);
//C.selectByValue("https://demowebshop.tricentis.com/books?viewmode=list");

	
	
}
}
