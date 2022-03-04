package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchingApplication {
	
	/*
	 * 1. Create a Maven Project
	 * 2. In POM.xml, add Selenium and webdrivermanager dependency
	 * 3. Save it
	 * 4. use them in your class
	 */
	

	public static void main(String[] args) throws InterruptedException {
		/*
		 * FB Login Test - Manually
		 * 1. Open browser
		 * 2. Enter URL
		 * 3. Enter username
		 * 4. Enter password
		 * 5. Click on Login
		 * 6. Close the browser
		 */
		
		//Pre step: configuring and deciding which browser to use
		WebDriverManager.chromedriver().setup();
		
		//Step1: Opening the browser
		WebDriver driver = new ChromeDriver();
		
		//2. Enter URL
		driver.get("https://www.facebook.com/");
		
		//3. Enter username
		driver.findElement(By.id("email")).sendKeys("DummyUsername");
		
		//4. Enter password
		String passwordValue = "dummypassword";
		//WebElement password =  driver.findElement(By.name("pass"));
		//WebElement password = driver.findElement(By.cssSelector("#pass"));
		WebElement password = driver.findElement(By.xpath("//*[@id='pass']"));
		password.sendKeys(passwordValue);
		
		//driver.findElement(By.name("login")).click();
		
		System.out.println("Finding urls");
		List<WebElement> urls = driver.findElements(By.tagName("a"));
		System.out.println(urls.size());
		for (WebElement abc : urls) {
			//System.out.println(abc.getText());
		}
		
		//driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.partialLinkText("Forgotten")).click();
		Thread.sleep(4000);
		driver.close();
	}
}
