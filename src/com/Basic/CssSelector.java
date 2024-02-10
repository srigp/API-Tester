package com.Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
	static WebDriver driver;

	private static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Krithik\\eclipse-workspace\\Selenium_Java\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	private static void urlLauncher() {
		driver.get("https://www.facebook.com");
		driver.findElement(By.cssSelector("#email")).sendKeys("qwerty");
		driver.findElement(By.cssSelector("[type^='pass']")).sendKeys("1234567890"); //prefix
		driver.findElement(By.cssSelector("[type$='word']")).sendKeys("1234567890"); //suffix
		driver.findElement(By.cssSelector("[type*='ass']")).sendKeys("1234567890"); //any words in string
	}
	
	public static void main(String[] args) {
		browserLaunch();
		urlLauncher();
	}
}
