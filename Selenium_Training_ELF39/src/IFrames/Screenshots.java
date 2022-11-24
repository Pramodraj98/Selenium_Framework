package IFrames;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots {
	public static void main(String[] args) throws AWTException, InterruptedException, IOException  {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		// take screenshot type casting with driver instance
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File homepage=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("./Screenshots/screenshot2.png");
		FileHandler.copy(homepage, destination);
		
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		File regpage=ts.getScreenshotAs(OutputType.FILE);
		File fill=new File("./Screenshots/screenshot3.png");
		FileHandler.copy(regpage, fill);
		
	}
}
