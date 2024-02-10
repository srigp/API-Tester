package com.Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	static WebDriver driver;

	private static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Krithik\\eclipse-workspace\\Selenium_Java\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	private static void urlLaunch() {
		driver.get("https://cosmocode.io/automation-practice-webtable/");
	}
	
	private static void allData() {
		List<WebElement> table = driver.findElements(By.tagName("table"));
		int size = table.size();
		System.out.println(size);
		
		List<WebElement> allData = driver.findElements(By.xpath("//table/tbody/tr/td"));
		for(WebElement x : allData) {
			System.out.println(x.getText());
		}
	}

	private static void rowData() {
		List<WebElement> rowData = driver.findElements(By.xpath("//table/tbody/tr[197]/td"));
		for(int i=0;i<rowData.size();i++) {
			System.out.println(rowData.get(i).getText());
		}
	}
	
	private static  void columnData() {
		List<WebElement> columnData = driver.findElements(By.xpath("//table/tbody/tr/td[3]"));
		for(WebElement x : columnData) {
			System.out.println(x.getText());
		}
	}
	
	private static void particularData() {
		WebElement partcular = driver.findElement(By.xpath("//table/tbody/tr[5]/td[4]"));
		System.out.println(partcular.getText());
	}
	public static void main(String[] args) {
		browserLaunch();
		urlLaunch();
		allData();
		rowData();
		columnData();
		particularData();
	}

}