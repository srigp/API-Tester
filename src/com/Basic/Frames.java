package com.Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	static WebDriver driver;

	private static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Krithik\\eclipse-workspace\\Selenium_Java\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	private static void urlLaunch() {
		driver.get("https://letcode.in/frame/");
	}

	private static void frames() {
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("Palani");
		

	}

	private static void innerFrame() {
		WebElement findElement = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
		driver.switchTo().frame(findElement);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("palani.pitchiah@tcs.com");
	}

	private static void parentFrame() {
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[@name='lname']")).sendKeys("Pitchiah");
	}

	private static void parentPage() {
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("(//span[@class='icon has-text-primary'])[1]")).click();
		
	}

	public static void main(String[] args) {
		browserLaunch();
		urlLaunch();
		frames();
		innerFrame();
		parentFrame();
		parentPage();
	}
}
