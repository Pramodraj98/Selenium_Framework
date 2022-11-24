package From_Testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Chrono_order {
	
		@Test
		public void firststop() {
			System.out.println("Nimmi");
		}

		@Test
		public void secondstop() {
			System.out.println("dummi");
		}

		@AfterSuite
				public void aftersuit() {
			System.out.println("mummy");
		}
		
		@AfterClass
		public void afterclass() {
			System.out.println("agthale");
		}
		
		@AfterMethod
		public void aftermethod() {
			System.out.println("next year");
		}
		
		@BeforeMethod
		public void b4method(){
			System.out.println("FRIEND");
		}
		
		@BeforeTest
		public void b4test() {
			System.out.println("Nan");
		}
	}

