package org.seleniumday8questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question6 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		WebElement login = driver.findElement(By.xpath("(//div[@class='continue_btn'])[1]"));
		login.click();
		Thread.sleep(2000);
		WebElement login1 = driver.findElement(By.xpath("(//input[@class='btn btn-default'])[1]"));
		login1.click();
		driver.switchTo().alert().accept();
	}

}
