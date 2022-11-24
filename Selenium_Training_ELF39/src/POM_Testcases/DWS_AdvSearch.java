package POM_Testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_utility.Base_test;
import Framework_utility.Utitlity_methods;
import POM_Pages.DMS_AdvSearchpage;
import POM_Pages.DWS_Homepage;

public class DWS_AdvSearch extends Base_test{
	
	@DataProvider(name="src")
	public Object[] test() throws IOException {
		Object[][] data=Utitlity_methods.getTestData("Search");
		return data;
	}
	
	
@Test(dataProvider = "src")
public void TC(String dt) {
	DWS_Homepage hp=new DWS_Homepage(driver);
	hp.Search_field(dt);
	hp.Search_click();
	
	DMS_AdvSearchpage ads=new DMS_AdvSearchpage(driver);
	ads.advance_click();
	
}
}
