package com.Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_CssSelector {

	static WebDriver driver;

	private static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Krithik\\eclipse-workspace\\Selenium_Java\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	private static void urlLaunch() {
		driver.get("https://adactinhotelapp.com/");
	}

	private static void login() {
		driver.findElement(By.cssSelector("#username")).sendKeys("srigo0107");
		driver.findElement(By.cssSelector("#password")).sendKeys("53W6M4");
		driver.findElement(By.cssSelector(".login_button")).click();
	}

	private static void searchHotel() {
		WebElement location = driver.findElement(By.cssSelector("#location"));
		Select s = new Select(location);
		s.selectByValue("Brisbane");

		WebElement hotel = driver.findElement(By.cssSelector("#hotels"));
		Select s1 = new Select(hotel);
		s1.selectByValue("Hotel Cornice");

		WebElement room_type = driver.findElement(By.cssSelector("#room_type"));
		Select s2 = new Select(room_type);
		s2.selectByValue("Super Deluxe");

		WebElement room_number = driver.findElement(By.cssSelector("#room_nos"));
		Select s3 = new Select(room_number);
		s3.selectByValue("2");

		WebElement adult_room = driver.findElement(By.cssSelector("#adult_room"));
		Select s4 = new Select(adult_room);
		s4.selectByValue("2");

		WebElement child_room = driver.findElement(By.cssSelector("#child_room"));
		Select s5 = new Select(child_room);
		s5.selectByValue("1");

		driver.findElement(By.cssSelector("#Submit")).click();
	}

	private static void selectHotel() {
		driver.findElement(By.cssSelector("#radiobutton_0")).click();
		driver.findElement(By.cssSelector("#continue")).click();
	}

	private static void bookHotel() throws InterruptedException {
		driver.findElement(By.cssSelector("#first_name")).sendKeys("Palani");
		driver.findElement(By.cssSelector("#last_name")).sendKeys("Pitchiah");
		driver.findElement(By.cssSelector("#address")).sendKeys("London");
		driver.findElement(By.cssSelector("#cc_num")).sendKeys("7890789078907890");

		WebElement cctype = driver.findElement(By.cssSelector("#cc_type"));
		Select s = new Select(cctype);
		s.selectByValue("AMEX");

		WebElement expMon = driver.findElement(By.cssSelector("#cc_exp_month"));
		Select s1 = new Select(expMon);
		s1.selectByValue("9");

		WebElement expYear = driver.findElement(By.cssSelector("#cc_exp_year"));
		Select s2 = new Select(expYear);
		s2.selectByValue("2025");

		driver.findElement(By.cssSelector("#cc_cvv")).sendKeys("789");

		driver.findElement(By.cssSelector("#book_now")).click();

		Thread.sleep(8000);
	}

	private static void logout() throws InterruptedException {
		driver.findElement(By.cssSelector("#my_itinerary")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#logout")).click();
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		browserLaunch();
		urlLaunch();
		login();
		searchHotel();
		selectHotel();
		bookHotel();
		logout();
	}
}
