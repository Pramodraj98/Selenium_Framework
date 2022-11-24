package POM_Testcases;

import org.testng.annotations.Test;

import Framework_utility.Base_test;
import POM_Pages.DWS_Homepage;
import POM_Pages.DWS_Loginpage;

public class DWS_Login_Test extends Base_test{

	@Test
	public void TC01() {
		
		DWS_Homepage hp=new DWS_Homepage(driver);
		hp.Click_login();
		
		DWS_Loginpage lp=new DWS_Loginpage(driver);
		lp.Enter_username("Pramod016@gmail.com");
		lp.Enter_password("Raj#123");
		lp.Click_login();
		
	}
	
}
