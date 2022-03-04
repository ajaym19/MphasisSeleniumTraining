package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsDemo {

	public static void main(String[] args) throws InterruptedException {
		// hover();
		// seriesofActions();
		dragDrop();
	}

	public static void hover() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		WebElement kidsMenu = driver.findElement(By.xpath("//a[contains(@data-group,'kids')]"));
		Actions action = new Actions(driver);
		action.moveToElement(kidsMenu).perform();
		Thread.sleep(5000);
		driver.quit();
	}

	public static void seriesofActions() throws InterruptedException {
		System.out.println(1);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement username = driver.findElement(By.id("txtUsername"));
		Actions act = new Actions(driver);
		act.moveToElement(username).click().keyDown(Keys.SHIFT).sendKeys("admin").keyUp(Keys.SHIFT).perform();

		Thread.sleep(5000);
		driver.quit();
	}

	public static void dragDrop() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
		act.dragAndDrop(draggable, droppable).perform();
		Thread.sleep(5000);
		driver.quit();
	}
}
