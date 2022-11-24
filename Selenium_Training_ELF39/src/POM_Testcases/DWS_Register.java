package POM_Testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_utility.Base_test;
import Framework_utility.Utitlity_methods;
import POM_Pages.DWS_Homepage;
import POM_Pages.DWS_Registerpage;

public class DWS_Register extends Base_test{
	@DataProvider(name="reg")
	public Object[] test() throws IOException {
		Object[][] data=Utitlity_methods.getTestData("Register");
		return data;
	}
	
	@Test(dataProvider = "reg")
	public void tc(String FN,String LN,String em,String pwd,String cpwd) {
		DWS_Homepage hp=new DWS_Homepage(driver);
		hp.Register_click();
		 
		DWS_Registerpage rp=new DWS_Registerpage(driver);
		rp.Enter_Firstname(FN);
		rp.Enter_Lastname(LN);
		rp.Enter_Email(em);
		rp.Enter_Password(pwd);
		rp.Enter_confpassword(cpwd);
		rp.Gender_click();
		rp.Submit_click();
	}
}
