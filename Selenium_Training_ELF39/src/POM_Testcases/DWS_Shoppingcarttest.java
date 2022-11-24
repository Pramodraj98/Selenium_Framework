package POM_Testcases;

import org.testng.annotations.Test;

import Framework_utility.Base_test;
import POM_Pages.DMS_Shoppingcartpage;
import POM_Pages.DWS_Homepage;
import POM_Pages.DWS_Jewelrypage;

public class DWS_Shoppingcarttest extends Base_test{
@Test
	
	public void jew() {
		DWS_Homepage hp=new DWS_Homepage(driver);
		hp.click_jewelry();
		
		DMS_Shoppingcartpage sc=new DMS_Shoppingcartpage(driver);
		sc.Click_sortby();
		sc.select_sortby("Name: A to Z");
		sc.Click_addtocart();
		sc.Click_Shoppingcart();
	}
}
