package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumFunctions {

	/*
	 * 1. get() - Done
	 * 2. getCurrentUrl() - Done
	 * 3. getPageSource() - Done
	 * 4. getTitle() - Done
	 * 5. getText() - Done
	 * 6. getAttribute() - Done
	 * 7. getWindowHandle()
	 * 8. getWindowHandles()
	 * 
	 * linktext - Done
	 * partialLinkText - Done
	 * 
	 * drop down
	 * 
	 */

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
		String pageSource = driver.getPageSource();
		//System.out.println(pageSource);
		String actualTitle = driver.getTitle();
		//System.out.println(actualTitle);
		String expTitle = "Facebook";
		
		if (actualTitle.equals(expTitle)) {
			System.out.println("Title are matching and TC passed");
		}else {
			System.out.println("Titles are not matching and TC is failed");
		}
		
		String attr = driver.findElement(By.id("email")).getAttribute("placeholder");
		System.out.println(attr);
		driver.close();
	}
}
