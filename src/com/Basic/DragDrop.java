package com.Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	static WebDriver driver;

	private static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Krithik\\eclipse-workspace\\Selenium_Java\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	private static void urlLaunch() {
		driver.get("https://www.demo.guru99.com/test/drag_drop.html");
	}
	
	private static void Dragand() {
		WebElement from = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement to = driver.findElement(By.xpath("//ol[@id='bank']"));
		Actions a = new Actions(driver);
		a.dragAndDrop(from, to).build().perform();
		WebElement fromAmount = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement toAmount = driver.findElement(By.xpath("//ol[@id='amt7']"));
		a.dragAndDrop(fromAmount, toAmount).build().perform();
	}
	public static void main(String[] args) {
		browserLaunch();
		urlLaunch();
		Dragand();
	}

}
