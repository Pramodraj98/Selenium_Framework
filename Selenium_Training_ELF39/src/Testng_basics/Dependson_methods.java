package Testng_basics;

import org.testng.annotations.Test;

public class Dependson_methods {
@Test(dependsOnMethods = "Register")
public void Login() {
	System.out.println("Ex Login");
}

@Test
public void Register() {
	System.out.println("Ex Register");
}

@Test(dependsOnMethods =  {"Register","Login"})
public void Search() {
	System.out.println("Ex Search");
}

@Test(dependsOnMethods = "Wishlist")
public void Logout() {
	System.out.println("Ex Logout");
}

@Test(dependsOnMethods = "Search")
public void Wishlist() {
	System.out.println("Ex Wishlist");
}
}
