package com.Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Krithik\\eclipse-workspace\\Selenium_Java\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/"); // to open a url

		String title = driver.getTitle();
		System.out.println(title);

		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		driver.manage().window().maximize();

		String pageSource = driver.getPageSource();
		System.out.println(pageSource);

		Thread.sleep(4000);

		driver.navigate().to("https://www.instagram.com/");

		Thread.sleep(4000);

		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().refresh();

		Thread.sleep(4000);

		driver.navigate().forward();

	}
}
