package Waits;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitsDemo {

	/*
	 * Synchronizations/Waits
	 * 
	 * 1. Implicit wait
	 * 2. Explicit wait
	 * 3. Fluent wait
	 * 
	 * Thread.sleep()
	 * 
	 * max - 10 sec, sleep - 10 sec
	 * ele loaded in 03 sec
	 * wait- 3 sec, 
	 * thread sleep- 10
	 * 
	 */
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		
		//wait for page to load
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		//Implicit wait: applicable for all the elements
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		//Explicit wait
		//waiting for some conditions
		//only for one element
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement link;
		link = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("")));
		link.click();
		
		Wait wt = new FluentWait(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(4))
				.ignoring(Exception.class);
		
		
		
	}
}
