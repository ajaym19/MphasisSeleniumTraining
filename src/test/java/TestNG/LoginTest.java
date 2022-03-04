package TestNG;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {

	/*
	 * BeforeSuite BeforeTest BeforeClass BeforeMethod Test - actual TC AfterMethod
	 * AfterClass AfterTest AfterSuite
	 * 
	 */

	@BeforeMethod
	public void launchApplication() {
		System.out.println("Before Method");
	}

	@Test(priority = 3)
	public void abc() {
		System.out.println("ABC");
	}

	@Test(priority = 2)
	public void validateTitle() {
		System.out.println("Validating Title TC");
	}

	@Test(priority = 1)
	public void login() {
		System.out.println("Login TC");
	}

	@Test(priority = 4)
	public void sendFriendRequest() {
		System.out.println("sendFriendRequest");
		AssertJUnit.assertEquals(true, true);
	}

	@Test(priority = 5, dependsOnMethods = "sendFriendRequest")
	public void receiveFriendRequest() {
		System.out.println("receiveFriendRequest");
	}

	@AfterMethod
	public void closeBrowser() {
		System.out.println("After Method");
	}

	/*
	 * BM VT AM
	 * 
	 * 
	 */
}
