package POM_Testcases;

import org.testng.annotations.Test;

import Framework_utility.Base_test;
import POM_Pages.DWS_Homepage;
import POM_Pages.DWS_Jewelrypage;

public class DWS_Jewelry extends Base_test{

	@Test
	
	public void jew() {
		DWS_Homepage hp=new DWS_Homepage(driver);
		hp.click_jewelry();
		
		DWS_Jewelrypage jp=new DWS_Jewelrypage(driver);
		jp.Click_sortby();
		jp.select_sortby("Name: A to Z");
		jp.Click_addtocart();
	}
}
