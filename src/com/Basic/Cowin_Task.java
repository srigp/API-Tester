package com.Basic;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cowin_Task {

	static WebDriver driver;

	private static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Krithik\\eclipse-workspace\\Selenium_Java\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}


	private static void urlLaunch() throws InterruptedException {
		driver.get("https://www.cowin.gov.in/");
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1200)");
		Thread.sleep(2000);
	}

	private static void bookNow() throws InterruptedException {
		driver.findElement(By.xpath("//span[contains(text(),'Select Your State')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()=' Tamil Nadu ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Select District']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()=' Tirunelveli ']")).click();
		driver.findElement(By.xpath("//button[text()='Search']")).click();
	}

	public static void main(String[] args) throws InterruptedException {
		browserLaunch();
		urlLaunch();
		bookNow();
	}
}
