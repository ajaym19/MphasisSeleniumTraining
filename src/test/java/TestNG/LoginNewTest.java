package TestNG;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginNewTest {

	@Test(groups = "sanity")
	public void m1() {
		System.out.println("Sanity TC1");
	}
	
	@Test(groups = "sanity")
	public void m2() {
		System.out.println("Sanity TC2");
	}
	
	@Test(groups = "regression")
	public void m3() {
		System.out.println("Regression TC1");
	}
	
	@Test(groups = "regression")
	public void m4() {
		System.out.println("Regression TC2");
		
	}
}
