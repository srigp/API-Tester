package com.Basic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class AmazonTask {

	static WebDriver driver;
	static List<String> li;

	private static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Krithik\\eclipse-workspace\\Selenium_Java\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	private static void urlLaunch() {
		driver.get("https://www.amazon.in/");
	}

	private static void moveToElement() throws AWTException, InterruptedException {
		Actions ac = new Actions(driver);
		Robot r = new Robot();
		WebElement minitv = driver.findElement(By.xpath("//a[text()='Amazon miniTV']"));
		ac.contextClick(minitv).build().perform();
		Thread.sleep(200);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(200);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(200);
		WebElement bestseller = driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]"));
		ac.contextClick(bestseller).build().perform();
		Thread.sleep(200);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(200);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(200);
		WebElement deals = driver.findElement(By.xpath("//a[text()=' Electronics ']"));
		ac.contextClick(deals).build().perform();
		Thread.sleep(200);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(200);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(200);
	}

	private static void switchWindow() throws InterruptedException, IOException {

		li = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(li.get(1));
		driver.close();
		Thread.sleep(2000);

	}

//	private static void moveTo() throws InterruptedException {
//		driver.switchTo().window(li.get(2));
//		Thread.sleep(4000);
//	}

	private static void screenShot() throws IOException {

		TakesScreenshot ss = (TakesScreenshot) driver;
		File from = ss.getScreenshotAs(OutputType.FILE);
		File to = new File("C:\\Users\\Krithik\\eclipse-workspace\\Selenium_Java\\screenshot\\amazon.png");
		FileHandler.copy(from, to);
	}

	private static void browserQuit() {
		driver.quit();
	}

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		browserLaunch();
		urlLaunch();
		moveToElement();
		switchWindow();
//		moveTo();
		screenShot();
		browserQuit();
	}
}
