package com.Basic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardActions {

	static WebDriver driver;

	private static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Krithik\\eclipse-workspace\\Selenium_Java\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	private static void urlLaunch() {
		driver.get("https://www.facebook.com");
	}
	
	private static void keyBoard() throws AWTException {
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_P);
	}
	
	public static void main(String[] args) throws AWTException {
		browserLaunch();
		urlLaunch();
		keyBoard();
	}
}
