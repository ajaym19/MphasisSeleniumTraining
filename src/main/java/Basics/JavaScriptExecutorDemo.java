package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//scrolling by specific pixels
		//js.executeScript("window.scrollBy(0,3000)");
		
		/*
		 * x-pixels: defines the x-axis
		 * if number is positive: moves left
		 * if number is negative: moves right
		 * 
		 * y-pixels: defines the y-axis
		 * if number is positive: moves down
		 * if number is negative: moves up
		 */
		
		//moving down at the end
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		WebElement kidsMenu = driver.findElement(By.xpath("//a[contains(@data-group,'kids')]"));
		//js.executeScript("arguments[0].click()", kidsMenu);
		
		
		//scrolling to a specific element
		WebElement shipping = driver.findElement(By.xpath("//a[text()='Shipping']"));
		js.executeScript("arguments[0].scrollIntoView()",shipping);
		
		Thread.sleep(7000);
		driver.quit();
		
		
	}
}
