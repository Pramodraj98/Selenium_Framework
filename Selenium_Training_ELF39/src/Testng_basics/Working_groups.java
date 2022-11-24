package Testng_basics;

import org.testng.annotations.Test;

public class Working_groups {
	@Test(groups ="Smoke Test",priority = 2)
	public void Login() {
		System.out.println("Ex Login");
	}

	@Test(groups = "Smoke Test",priority = 1)
	public void Register() {
		System.out.println("Ex Register");
	}

	@Test(groups = "Smoke Test",priority = 3)
	public void Search() {
		System.out.println("Ex Search");
	}

	@Test
	public void Logout() {
		System.out.println("Ex Logout");
	}

	@Test
	public void Wishlist() {
		System.out.println("Ex Wishlist");
	}
}
