package Basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	//Original: Selenium Framework |   Practiceform
	//New: Selenium Framework | Selenium, Cucumber, Ruby, Java et al.
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.seleniumframework.com/Practiceform/");
		System.out.println("In Parent Window");
		String parentWindow = driver.getWindowHandle();
		//System.out.println("Parent Window ID is "+parentWindow);
		System.out.println(driver.getTitle());
		driver.findElement(By.id("button1")).click();
		//2
		Set<String> windows = driver.getWindowHandles();
		String childWindow = null;
		for (String a : windows) {
			//System.out.println(a);
			if (a != parentWindow) {
				childWindow = a;
			}
		}
		
		//System.out.println("Child Window ID is "+ childWindow);
		
		System.out.println("Switching to Child Window");
		driver.switchTo().window(childWindow);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(parentWindow);
		//driver.close();
		driver.quit();
		
	}
}
