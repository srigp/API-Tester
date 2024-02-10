package com.Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Dropdown {
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
	
	private static void multiple() {
		WebElement food = driver.findElement(By.xpath("//select[@id='second']"));
		Select s = new Select(food);
		boolean multi = s.isMultiple();
		System.out.println(multi);
		s.selectByVisibleText("Pizza");
		s.selectByIndex(2);
		s.selectByValue("bonda");
		s.deselectByIndex(3);
		
		List<WebElement> options = s.getOptions();
		System.out.println("All Foods");
		for(WebElement o : options) {
			System.out.println(o.getText());
		}
		
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		System.out.println("All selected foods");
		for(WebElement all : allSelectedOptions) {
			System.out.println(all.getText());
		}
		
		System.out.println(s.getFirstSelectedOption().getText());
		
		s.deselectAll();
	}
	
	public static void main(String[] args) {
		browserLaunch();
		UrlLaunch();
		multiple();
	}
}
