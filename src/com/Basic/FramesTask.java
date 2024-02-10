package com.Basic;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesTask {

	static WebDriver driver;
	static List<String> lis;

	private static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Krithik\\eclipse-workspace\\Selenium_Java\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	private static void urlLauncher() {
		driver.get("https://demo.automationtesting.in/Frames.html");
	}

	private static void demoFrame() throws InterruptedException, AWTException {
		driver.findElement(By.xpath("(//a[@class=\"analystic\"])[1]")).click();
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Palani Pitchiah");
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("(//a[@class=\"analystic\"])[2]")).click();
		driver.switchTo().frame(2);
		WebElement innerFrame = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(innerFrame);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Krithik Ishan");
	}

	private static void gotoTab() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.open('https://ui.vision/demo/webtest/frames/')");
		Thread.sleep(1000);

		lis = new ArrayList<String>(driver.getWindowHandles());
		Thread.sleep(2000);
		driver.switchTo().window(lis.get(1));

		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Palani");
		driver.switchTo().defaultContent();

		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Krithik");
		driver.switchTo().defaultContent();

		driver.switchTo().frame(2);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Ishan");
		WebElement form = driver.findElement(By.xpath(
				"//iframe[@src='https://docs.google.com/forms/d/1yfUq-GO9BEssafd6TvHhf0D6QLDVG3q5InwNE2FFFFQ/viewform?embedded=true']"));
		driver.switchTo().frame(form);
		driver.findElement(By.xpath("//div[@id='i8']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='i19']")).click();
		
		driver.findElement(By.xpath("//div[@jsname='LgbsSe']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Yes'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class=\"l4V7wb Fxmcue\"])[2]")).click();
		driver.findElement(By.xpath("//input[@jsname='YPqjbf']")).sendKeys("Palani");
		driver.findElement(By.xpath("//textarea")).sendKeys("Palani Pitchiah Krithik Ishan Shabana");
		driver.switchTo().defaultContent();

		driver.switchTo().frame(3);
		driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("Shabu");
		driver.switchTo().defaultContent();

	}

	public static void main(String[] args) throws InterruptedException, AWTException {
		browserLaunch();
		urlLauncher();
		demoFrame();
		gotoTab();
	}

}
