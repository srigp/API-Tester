package com.Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Task {

	static WebDriver driver;

	private static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Krithik\\eclipse-workspace\\Selenium_Java\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	private static void urlLauncher() {
		driver.get("https://cosmocode.io/automation-practice-webtable/");
	}

	private static void findWebElement() {
		WebElement helsinki = driver.findElement(By.xpath("//table/tbody/tr[61]/td[3]"));
		System.out.println("\n" + helsinki.getText());

		List<WebElement> jamaica = driver.findElements(By.xpath("//table/tbody/tr[85]"));
		for (WebElement x : jamaica) {
			System.out.println("\n" + x.getText());
		}

		WebElement norway = driver.findElement(By.xpath("//table/tbody/tr[132]/td[4]"));
		System.out.println("\n" + norway.getText());
		System.out.println("\n");

		List<WebElement> language = driver.findElements(By.xpath("//table/tbody/tr/td[5]"));
		for (WebElement y : language) {
			System.out.println(y.getText());
		}
		System.out.println("\n");

		WebElement zim = driver.findElement(By.xpath("//table/tbody/tr[197]/td[2]"));
		System.out.println(zim.getText());

	}

	public static void main(String[] args) {
		browserLaunch();
		urlLauncher();
		findWebElement();
	}
}
