package com.Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin {

	static WebDriver driver;

	private static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Krithik\\eclipse-workspace\\Selenium_Java\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	private static void openUrl() {
		driver.get("https://adactinhotelapp.com/");
	}
	
	private static void login() {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("srigo0107");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("53W6M4");
		driver.findElement(By.xpath("//input[@id='login']")).click();
	}
	
	private static void searchHotel() {
		WebElement location = driver.findElement(By.xpath("//select[@id='location']"));
		Select s = new Select(location);
		s.selectByValue("London");
		
		WebElement hotels = driver.findElement(By.xpath("//select[@id='hotels']"));
		Select s1 = new Select(hotels);
		s1.selectByValue("Hotel Sunshine");
		
		WebElement roomType = driver.findElement(By.xpath("//select[@id='room_type']"));
		Select s2 = new Select(roomType);
		s2.selectByValue("Super Deluxe");
		
		WebElement roomNumber = driver.findElement(By.xpath("//select[@id='room_nos']"));
		Select s3 = new Select(roomNumber);
		s3.selectByValue("3");
		
		WebElement adultCount = driver.findElement(By.xpath("//select[@id='adult_room']"));
		Select s4 = new Select(adultCount);
		s4.selectByValue("2");
		
		WebElement childCount = driver.findElement(By.xpath("//select[@id='child_room']"));
		Select s5 = new Select(childCount);
		s5.selectByValue("1");
		
		driver.findElement(By.xpath("//input[@id='Submit']")).click();
	}
	
	private static void selectHotel() {
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		driver.findElement(By.xpath("//input[@id='continue']")).click();
	}
	
	private static void bookHotel() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Palani");
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Pitchiah");
		driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("Bournemouth, London");
		driver.findElement(By.xpath("//input[@name='cc_num']")).sendKeys("6789678967896789");
		
		WebElement cardType = driver.findElement(By.xpath("//select[@name='cc_type']"));
		Select s = new Select(cardType);
		s.selectByValue("AMEX");
		
		WebElement expMonth = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select s1 = new Select(expMonth);
		s1.selectByValue("9");
		
		WebElement expYear = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select s2 = new Select(expYear);
		s2.selectByValue("2025");
		
		driver.findElement(By.xpath("//input[@name='cc_cvv']")).sendKeys("916");
		
		driver.findElement(By.xpath("//input[@name='book_now']")).click();
		Thread.sleep(10000);
	}
	 
	private static void bookingConfirmationandLogoff() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='my_itinerary']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	}
	
	private static void browserQuit() {
		driver.close();
	}
	
	public static void main(String[] args) throws InterruptedException {
		browserLaunch();
		openUrl();
		login();
		searchHotel();
		selectHotel();
		bookHotel();
		bookingConfirmationandLogoff();
		browserQuit();
	}
	
}
