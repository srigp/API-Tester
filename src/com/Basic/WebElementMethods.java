package com.Basic;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {

	static WebDriver driver;

	private static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Krithik\\eclipse-workspace\\Selenium_Java\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	private static void urlLaunch() {

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Dimension s = new Dimension(500,500);
		driver.manage().window().setSize(s);
	}

	private static void loginPage() {
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("kamalpalani@gmail.com");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("papasri");
		
		WebElement login = driver.findElement(By.className("selected"));
		login.click();
		
		email.clear();
	}

	
	public static void main(String[] args) {
		browserLaunch();
		urlLaunch();
		loginPage();
		
	}
}
