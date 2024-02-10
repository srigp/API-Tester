package com.Basic;

import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Krithik\\eclipse-workspace\\Selenium_Java\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

//		driver.get("https://www.flipkart.com/");
//		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("IPhone", Keys.ENTER);
//		// driver.findElement(By.xpath("//div[@data-id='MOBGHWFHECFVMDCXś']")).click();
//		driver.findElement(By.xpath("(//div[contains(text(),'Apple iPhone')])[2]")).click(); // to click on the very
//																									// second product

		driver.get(
				"https://www.myntra.com/kids?f=Categories%3ATshirts%3A%3AGender%3Aboys%2Cboys%20girls&plaEnabled=false");
		// driver.findElement(By.xpath("//a[@data-group='kids']")).click();

		List<WebElement> findElements = driver.findElements(By.xpath("//li[@class='product-base']"));
		

	}
}
