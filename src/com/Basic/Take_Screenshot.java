package com.Basic;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Take_Screenshot {

	static WebDriver driver;
	static TakesScreenshot t;

	private static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Krithik\\eclipse-workspace\\Selenium_Java\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	private static void urlLaunch() {
		driver.get("https://facebook.com/");
	}

	private static void screenshot() throws IOException {
		// lowerdatatype ref = (lowerdatatype)higherdatatype-refname
		// h.datatype---- wedriver
		// l.datatype---- takes

		t = (TakesScreenshot) driver;
		File from = t.getScreenshotAs(OutputType.FILE);
		File to = new File("C:\\Users\\Krithik\\eclipse-workspace\\Selenium_Java\\screenshot\\adactin.png");
		// FileUtils.copyFile(from, to);
		org.openqa.selenium.io.FileHandler.copy(from, to);
	}

	public static void main(String[] args) throws IOException {
		browserLaunch();
		urlLaunch();
		screenshot();
	}
}
