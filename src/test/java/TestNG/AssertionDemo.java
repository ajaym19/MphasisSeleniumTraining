package TestNG;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionDemo {

	WebDriver driver;
	
	@BeforeMethod
	public void launchApplication() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test
	public void validateTitleTC() {
		String expectedTitle = "OrangeHRM India";
		String actualTitle = driver.getTitle();
		AssertJUnit.assertEquals(expectedTitle, actualTitle);
		//Assert.assertTrue();
	}
	
	@AfterMethod
	public void closeApplication() {
		driver.quit();
	}
}
