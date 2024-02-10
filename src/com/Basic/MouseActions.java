package com.Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	static WebDriver driver;

	private static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Krithik\\eclipse-workspace\\Selenium_Java\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}


	private static void urlLaunch() {
		driver.get("https://www.facebook.com/");
	}
	
	private static void doubleClick() {
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("qwerty");
//		Actions act = new Actions(driver);
//		act.doubleClick(email).build().perform(); //double click
//		
//		act.contextClick(email).build().perform(); //right click
	}
	
	private static void moveToElement() {
		WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
		Actions a = new Actions(driver);
		a.moveToElement(password).build().perform();
		a.click(password).build().perform();
//		password.sendKeys("345678");
	}

	public static void main(String[] args) {
		browserLaunch();
		urlLaunch();
		doubleClick();
		moveToElement();
	}
}
