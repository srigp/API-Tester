package com.Basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandler {

	static WebDriver driver;
	static String windowHandle;

	private static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Krithik\\eclipse-workspace\\Selenium_Java\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	private static void urlLaunch() throws InterruptedException {
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

	}

	private static void firstWindowId() {
		windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();

	}

	private static void allwindowID() throws InterruptedException {

		List<String> li = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(li);
		driver.switchTo().window(li.get(1));
		System.out.println(li.get(1));
		Thread.sleep(3000);
		driver.quit();
//		Set<String> windowHandles = driver.getWindowHandles();
//		System.out.println(windowHandles);
//		for (String x : windowHandles) {
//			if (!x.equals(windowHandle)) {
//				driver.switchTo().window(x);
//				driver.manage().window().maximize();
//			}
//		}

	}

	public static void main(String[] args) throws InterruptedException {
		browserLaunch();
		urlLaunch();
		firstWindowId();
		allwindowID();
	}
}
