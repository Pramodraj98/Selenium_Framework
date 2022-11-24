package POM_Testcases;

import org.testng.annotations.Test;

import Framework_utility.Base_test;
import Framework_utility.Utitlity_methods;
import POM_Pages.DWS_Homepage;

public class DWS_Mousehover extends Base_test{
@Test
	
	public void mouse() {
		DWS_Homepage hp=new DWS_Homepage(driver);
		hp.Mouse_hover(driver);
	
}
}
