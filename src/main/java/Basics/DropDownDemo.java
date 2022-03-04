package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://output.jsbin.com/osebed/2");
		//identify the dropdown
		WebElement fruits = driver.findElement(By.id("fruits"));
		Select op = new Select(fruits);
		//op.selectByIndex(1);
		op.selectByValue("banana");
		op.selectByVisibleText("Orange");
		
		Thread.sleep(5000);
		driver.close();
		
		
	}
}
