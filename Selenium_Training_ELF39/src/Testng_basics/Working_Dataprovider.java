package Testng_basics;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Working_Dataprovider {
	@DataProvider(name="TestData")
	public Object[][] testdata(){
		Object[][] data=new Object[4][2];
		
		data [0][0]="VK";
		data [0][1]=18;	
		
		data [1][0]="MSD";
		data [1][1]=7;
		
		data [2][0]="ABD";
		data [2][1]=17;		
		
		data [3][0]="JIMMY";
		data [3][1]=613;	
		
		return data;
 	}
	@Test(dataProvider = "TestData")
	public void testmethod(String Fname,int jerseynor) {
		System.out.println(Fname);
		System.out.println(jerseynor);
	}
}
