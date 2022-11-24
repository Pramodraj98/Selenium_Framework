package From_Selectclass;

         // BACK TRACKING


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

        
public class Xpathdep_course {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(((//table[@id='product'])[1]/tbody/tr)[4]/td)[3]/../../tr[7]/td[3]/../../tr[10]/td[3]"));
		
	}
}
