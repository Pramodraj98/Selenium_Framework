package POM_Testcases;

import org.testng.annotations.Test;

import Framework_utility.Base_test;
import POM_Pages.DWS_Giftcardspage;
import POM_Pages.DWS_Homepage;

public class DWS_Giftcards extends Base_test{
@Test
	
	public void jew() {
		DWS_Homepage hp=new DWS_Homepage(driver);
		hp.Click_giftcards();
		
		DWS_Giftcardspage gc=new DWS_Giftcardspage(driver);
		gc.Addcard_wishlist();
		
}
}
