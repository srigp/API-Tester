package com.Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Dropdown {
	static WebDriver driver;

	private static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Krithik\\eclipse-workspace\\Selenium_Java\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	private static void UrlLaunch() {
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
	}
	
	private static void singleDrop() throws InterruptedException {
		WebElement products = driver.findElement(By.xpath("//select[@id='first']"));
		Select s = new Select(products);
		s.selectByIndex(2); //select based on the index value
		Thread.sleep(3000);
		s.selectByValue("Google"); //select based on the value from dropdown
	}
	
	private static void singleDrop2() {
		WebElement animals = driver.findElement(By.xpath("//select[@id='animals']"));
		Select s = new Select(animals);
		s.selectByVisibleText("Baby Cat"); //select the drop-down by visible text
	}
	public static void main(String[] args) throws InterruptedException {
		browserLaunch();
		UrlLaunch();
		singleDrop();
		singleDrop2();
	}
}
