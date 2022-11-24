package Testng_basics;

import org.testng.annotations.Test;

public class Priority_execution {
	@Test(priority = 2)
	public void Login() {
		System.out.println("Ex Login");
	}

	@Test(priority = 1)
	public void Register() {
		System.out.println("Ex Register");
	}

	@Test(priority = 3)
	public void Search() {
		System.out.println("Ex Search");
	}

	@Test(priority = 5)
	public void Logout() {
		System.out.println("Ex Logout");
	}

	@Test(priority = 4)
	public void Wishlist() {
		System.out.println("Ex Wishlist");
	}
}
