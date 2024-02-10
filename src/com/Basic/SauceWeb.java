package com.Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceWeb {
	static WebDriver driver;

	private static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Krithik\\eclipse-workspace\\Selenium_Java\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	private static void launchUrl() {
		driver.get("https://www.saucedemo.com/v1/");
	}

	private static void login() {
		driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
	}

	private static void checkOut() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='ADD TO CART'][1]")).click();
		driver.findElement(By.xpath("//div[@id='shopping_cart_container']")).click();
		driver.findElement(By.xpath("//a[contains(@class,'checkout')]")).click();
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Palani");
		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Pitchiah");
		driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("assd");
		driver.findElement(By.xpath("//input[@value='CONTINUE']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'FINISH')]")).click();
		WebElement OrderStatus = driver.findElement(By.xpath("//div[@class='complete-text']"));

		String print = OrderStatus.getText();
		System.out.println(print);
	}

	private static void logOff() throws InterruptedException {
		driver.findElement(By.xpath("//button[contains(text(),'Open Menu')]")).click();
		Thread.sleep(10);
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {

		browserLaunch();
		launchUrl();
		login();
		checkOut();
		logOff();
	}

}
