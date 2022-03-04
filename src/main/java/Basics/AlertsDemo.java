package Basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		driver.findElement(By.id("alertexamples")).click();
		Thread.sleep(3000);
		//handle the alert
		Alert al = driver.switchTo().alert();
		al.accept();
		Thread.sleep(3000);
		
		driver.findElement(By.id("promptexample")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("Ajay");
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.quit();
		
	}
}
