package POM_Testcases;

import org.testng.annotations.Test;

import Framework_utility.Base_test;
import POM_Pages.DMS_Prod_Wishlistpage;
import POM_Pages.DMS_Shoppingcartpage;
import POM_Pages.DWS_Homepage;

public class DWS_Wishlisttest extends Base_test{
@Test
	
	public void jew() {
		DWS_Homepage hp=new DWS_Homepage(driver);
		hp.click_jewelry();
		
		DMS_Shoppingcartpage sc=new DMS_Shoppingcartpage(driver);
		sc.Click_sortby();
		sc.select_sortby("Name: A to Z");
		
		DMS_Prod_Wishlistpage wish=new DMS_Prod_Wishlistpage(driver);
		wish.Click_product();
		wish.Click_Wishlist();
		wish.View_wishlist();
}
}
