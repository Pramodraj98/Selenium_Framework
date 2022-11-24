package Test_cases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Framework_utility.Base_test;
import Framework_utility.Utitlity_methods;

public class Advance_search extends Base_test{

@DataProvider(name="advancesearch")
	
	public Object[]testadvancesearch() throws IOException{
		
		Object[][]data=Utitlity_methods.getTestData("Advance_search");                        //new Object[1][5];
		
//		data[0][0]="shoorts";
//		data[0][1]="Computers";
//		data[0][2]="Tricentis";
//		data[0][3]="1000";
//		data[0][4]="90000";
		return data;
	}
	@Test(dataProvider="advancesearch")
	
	public void demo(String txtfield,String category,String manufacturer,String start,String end) throws IOException {
		
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("./Report/ExecutionReport.html");
		
		//ATTACH THE REPORT TO HTML TEMPLATE
		ExtentReports reports=new ExtentReports();
		reports.attachReporter(reporter);
		
		//create a test with test cases
		ExtentTest test=reports.createTest("DWS Regresion");
		
	WebElement searchbar=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
	Utitlity_methods.Enter_Value_In_Textfield(searchbar, txtfield);
	
	WebElement clk=driver.findElement(By.xpath("//input[@value='Search']"));
	Utitlity_methods.Click_Element(clk);
	
	WebElement clk1=driver.findElement(By.xpath("//input[@id='As']"));
	Utitlity_methods.Click_Element(clk1);
	
	WebElement drop=driver.findElement(By.id("Cid"));
	Utitlity_methods.selectbyvisibletext(drop, category);
	
	WebElement checkbox=driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
	Utitlity_methods.Click_Element(checkbox);
	
	WebElement mfr=driver.findElement(By.id("Mid"));
	Utitlity_methods.selectbyvisibletext(mfr, manufacturer);
		
	WebElement from=driver.findElement(By.xpath("(//input[@type='text'])[4]"));
	Utitlity_methods.Enter_Value_In_Textfield(from, start);
	
	WebElement to=driver.findElement(By.xpath("(//input[@type='text'])[5]"));
	Utitlity_methods.Enter_Value_In_Textfield(to, end);
	
	WebElement click=driver.findElement(By.xpath("(//input[@type='checkbox'])[3]"));
	Utitlity_methods.Click_Element(click);
	
	test.pass("Search").addScreenCaptureFromPath(Utitlity_methods.Capture_screen_shot("Search"));
	
//	Utitlity_methods ut =new Utitlity_methods();
//	ut.Capture_screen_shot("");  --- if static method used in utility
	
	reports.flush();
		}
}

