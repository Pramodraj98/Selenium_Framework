package Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Browser_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		
// TO LAUNCH THE CHROME BROWSER
		
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new FirefoxDriver();
		
		//NAVIGATE TO WEBSITE
		driver.get("https://www.google.co.in");// get method navigate to required web
		//driver.get("https://www..co.in");
		
		driver.manage().window().maximize();// to maximise the screen
		
	}

}
