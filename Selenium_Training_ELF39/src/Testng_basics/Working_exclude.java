package Testng_basics;

import org.testng.annotations.Test;

public class Working_exclude {
	@Test
	public void Login() {
		System.out.println("Ex Login");
	}

	@Test
	public void Register() {
		System.out.println("Ex Register");
	}

	@Test
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
